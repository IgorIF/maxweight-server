package maxweight.ru.controllers.site;

import maxweight.ru.models.Role;
import maxweight.ru.models.User;
import maxweight.ru.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(@RequestParam(name = "name") String name, @RequestParam(name = "password") String password) {
        //User u = userRepository.findByName(name);

        /*if (u != null) {
            model.put("message", "User exists!");
        }*/

        User user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setRoles(Set.of(Role.USER));
        userRepository.save(user);
        return "redirect:/login";
    }

}
