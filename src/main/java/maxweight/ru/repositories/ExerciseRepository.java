package maxweight.ru.repositories;

import maxweight.ru.models.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
    Exercise findFirstByAlias(String alias);
}
