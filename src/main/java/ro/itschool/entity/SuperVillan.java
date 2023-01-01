package ro.itschool.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter
@Setter
@ToString
public class SuperVillan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String type;

    private  boolean isKiller;

    @ManyToOne
    @JoinColumn(name = "superhero_id")
    @ToString.Exclude
    private Superhero superhero;
}
