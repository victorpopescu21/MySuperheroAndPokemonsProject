package ro.itschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.itschool.entity.SuperVillan;

public interface SuperVillanRepository extends JpaRepository<SuperVillan, Long> {
}
