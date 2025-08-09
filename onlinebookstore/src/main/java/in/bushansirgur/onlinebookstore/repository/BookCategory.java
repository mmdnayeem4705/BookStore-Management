package in.bushansirgur.onlinebookstore.repository;

import javax.persistence.*;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import in.bushansirgur.onlinebookstore.entity.Book;
import lombok.Data;

@Entity
@Table(name = "book_category")
@Data
public class BookCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    @JsonIgnore
    private Set<Book> books;
}
