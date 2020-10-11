package maxweight.ru.repositories;

import maxweight.ru.models.Plan;
import maxweight.ru.models.Training;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingRepository extends JpaRepository<Training, Long> {
    Training findFirstByPlan(Plan plan);
}
