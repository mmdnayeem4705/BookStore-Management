package in.bushansirgur.onlinebookstore.entity;

import javax.persistence.*;
import java.util.Set;

import lombok.Data;

@Entity
@Table(name = "country")
@Data
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "country")
    private Set<State> states;
}
