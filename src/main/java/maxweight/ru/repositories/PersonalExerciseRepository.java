package maxweight.ru.repositories;

import maxweight.ru.models.PersonalExercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalExerciseRepository extends JpaRepository<PersonalExercise, Long> {
}
