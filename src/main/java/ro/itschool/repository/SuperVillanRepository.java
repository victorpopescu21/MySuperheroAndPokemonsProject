package ro.itschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.itschool.entity.Pokemon;
import ro.itschool.entity.SuperVillan;

import java.util.List;

public interface SuperVillanRepository extends JpaRepository<SuperVillan, Long> {
    List<SuperVillan> findByTypeIsNull();
}
