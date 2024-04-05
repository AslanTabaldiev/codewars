package codewars.demo.Repositories;

import codewars.demo.entity.Warrior;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarriorRepository extends JpaRepository<Warrior, Long> {
}
