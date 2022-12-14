package ro.itschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ro.itschool.entity.Pokemon;

import javax.swing.event.TableColumnModelListener;
import java.util.Collection;
import java.util.List;

public interface PokemonRepository extends JpaRepository<Pokemon,Long> {
    List<Pokemon> findByOrderByName();



}
