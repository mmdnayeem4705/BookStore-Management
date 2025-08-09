package in.bushansirgur.onlinebookstore.entity;

import javax.persistence.*;
import java.math.BigDecimal;

import lombok.Data;

@Entity
@Table(name = "book")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sku;
    private String name;
    private String description;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @Column(name = "image_url")
    private String imageUrl;

    private boolean active;

    @Column(name = "units_in_stock")
    private int unitsInStock;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private BookCategory category;
}
