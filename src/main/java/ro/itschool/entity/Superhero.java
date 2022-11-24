package ro.itschool.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Superhero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy ="superhero",cascade = CascadeType.ALL, fetch =FetchType.EAGER)
    private List<Pokemon> pokemons =new ArrayList<>();

    public void addPokemonsToList(Pokemon pokemon){
        pokemons.add(pokemon);
        pokemon.setSuperhero(this);
    }
}
