package maxweight.ru.repositories;

import maxweight.ru.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
