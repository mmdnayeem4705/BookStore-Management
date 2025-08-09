package in.bushansirgur.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import in.bushansirgur.onlinebookstore.entity.Book;

@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, Long> {
    Page<Book> findByCategoryId(Long id, Pageable pageable);
}
