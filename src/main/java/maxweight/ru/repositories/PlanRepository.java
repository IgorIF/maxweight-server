package maxweight.ru.repositories;

import maxweight.ru.models.Plan;
import maxweight.ru.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepository extends JpaRepository<Plan, Long> {
    Plan findFirstByUser(User user);
}
