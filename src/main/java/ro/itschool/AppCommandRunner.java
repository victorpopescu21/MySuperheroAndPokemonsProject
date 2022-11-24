package ro.itschool;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ro.itschool.entity.Pokemon;
import ro.itschool.entity.Superhero;
import ro.itschool.repository.PokemonRepository;
import ro.itschool.repository.SuperheroRepository;
@Slf4j
@Component
public class AppCommandRunner implements CommandLineRunner {

    @Autowired
    private SuperheroRepository superheroRepository;

    @Autowired
    private PokemonRepository pokemonRepository;

    @Override
    public void run(String... args) {
        Faker faker = new Faker();

        for(int i = 0; i<50;i++){
            Pokemon pokemon1 = new Pokemon();
            pokemon1.setName(faker.pokemon().name());
            pokemon1.setType("wateer");

            Pokemon pokemon2 = new Pokemon();
            pokemon2.setName(faker.pokemon().name());
            pokemon2.setType("wateer");

            Pokemon pokemon3 = new Pokemon();
            pokemon3.setName(faker.pokemon().name());
            pokemon3.setType("wateer");

            Superhero superhero = new Superhero();
            superhero.setName(faker.superhero().name());
            superhero.addPokemonsToList(pokemon1);
            superhero.addPokemonsToList(pokemon2);
            superhero.addPokemonsToList(pokemon3);

            superheroRepository.save(superhero);
        }

        //System.out.println(superheroRepository.findByNameEndingWith("man"));
        //System.out.println(superheroRepository.findByNameStartingWith("super"));
        //System.out.println(pokemonRepository.findByOrderByName());
        //System.out.println(superheroRepository.findByIdLessThanEqual(10));
        //System.out.println(superheroRepository.findByIsNull()); - not working

    }
}
