package maxweight.ru.controllers.api;

import maxweight.ru.models.User;
import maxweight.ru.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/add")
    public User addUser(@RequestParam String name) {
        User user = new User(name);
        userRepository.save(user);
        return user;
    }

    @GetMapping(path = "/getAll")
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping
    public String test() {
        return "Hello World";
    }
}
