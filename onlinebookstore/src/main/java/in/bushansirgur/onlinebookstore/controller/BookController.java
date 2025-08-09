package in.bushansirgur.onlinebookstore.controller;

import in.bushansirgur.onlinebookstore.repository.BookRepository;
import in.bushansirgur.onlinebookstore.repository.BookCategoryRepository;
import in.bushansirgur.onlinebookstore.entity.BookCategory;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class BookController {

    private static final Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookCategoryRepository bookCategoryRepository;

    @GetMapping("/books")
    public Page<in.bushansirgur.onlinebookstore.entity.Book> getAllBooks(@RequestParam(defaultValue = "0") int page,
                                  @RequestParam(defaultValue = "5") int size) {
        logger.info("Getting all books with page={}, size={}", page, size);
        return bookRepository.findAll(PageRequest.of(page, size));
    }

    @GetMapping("/book-category")
    public List<BookCategory> getAllBookCategories() {
        logger.info("Getting all book categories");
        List<BookCategory> categories = bookCategoryRepository.findAll();
        logger.info("Found {} categories", categories.size());
        return categories;
    }

    @GetMapping("/books/search/categoryid")
    public Page<in.bushansirgur.onlinebookstore.entity.Book> getBooksByCategoryId(
            @RequestParam Long id,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size) {
        logger.info("Getting books for category id={}, page={}, size={}", id, page, size);
        return bookRepository.findByCategoryId(id, PageRequest.of(page, size));
    }
}
