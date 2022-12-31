package ro.itschool;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ro.itschool.entity.Pokemon;
import ro.itschool.entity.Superhero;
import ro.itschool.repository.PokemonRepository;
import ro.itschool.repository.SuperVillanRepository;
import ro.itschool.repository.SuperheroRepository;
@Slf4j
@Component
public class AppCommandRunner implements CommandLineRunner {

    @Autowired
    private SuperheroRepository superheroRepository;

    @Autowired
    private PokemonRepository pokemonRepository;

    @Autowired
    private SuperVillanRepository superVillanRepository;

    @Override
    public void run(String... args) {
        Faker faker = new Faker();

        for(int i = 0; i<50;i++){
            Pokemon pokemon1 = new Pokemon();
            pokemon1.setName(faker.pokemon().name());
            pokemon1.setType(faker.weather().description());


            Pokemon pokemon2 = new Pokemon();
            pokemon2.setName(faker.pokemon().name());
            pokemon2.setType(faker.weather().description());

            Pokemon pokemon3 = new Pokemon();
            pokemon3.setName(faker.pokemon().name());
            pokemon3.setType(faker.weather().description());

            Superhero superhero = new Superhero();
            superhero.setName(faker.superhero().name());
            superhero.addPokemonsToList(pokemon1);
            superhero.addPokemonsToList(pokemon2);
            superhero.addPokemonsToList(pokemon3);
            pokemon1.setSuperhero(superhero);
            pokemon2.setSuperhero(superhero);
            pokemon3.setSuperhero(superhero);

            superheroRepository.save(superhero);
        }
        Pokemon pokemon4 =new Pokemon();
        pokemon4.setName(faker.pokemon().name());
        Pokemon pokemon5 =new Pokemon();
        pokemon5.setName(faker.pokemon().name());

        Superhero superhero2 =new Superhero();
        superhero2.setName("Super gigolo man");
        superhero2.addPokemonsToList(pokemon5);
        superheroRepository.save(superhero2);

        //System.out.println(superheroRepository.findByNameEndingWith("man"));
        //System.out.println(superheroRepository.findByNameStartingWith("Super"));
        //System.out.println(pokemonRepository.findByOrderByName());
        //System.out.println(superheroRepository.findByIdLessThanEqual(10));
        System.out.println(superheroRepository.findByTypeIsNull()); //- not working

    }
}
