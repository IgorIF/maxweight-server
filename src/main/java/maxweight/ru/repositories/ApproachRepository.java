package maxweight.ru.repositories;

import maxweight.ru.models.PersonalExercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApproachRepository extends JpaRepository<PersonalExercise.Approach, Long> {
}
