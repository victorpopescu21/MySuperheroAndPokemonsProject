package ro.itschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.itschool.entity.Superhero;

import java.util.List;

public interface SuperheroRepository extends JpaRepository<Superhero,Long> {

    //List<Superhero> findByNameEndingWith(String name);
    //List<Superhero> findByNameStartingWith(String name);
    List<Superhero> findByIdLessThanEqual(Integer id);
    List<Superhero> findByIsNull();

}
