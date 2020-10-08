package maxweight.ru.controllers.site.auth;

import maxweight.ru.models.User;
//import maxweight.ru.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/auth")
public class RegistrationController {
    /*@Autowired
    private UserService userService;*/

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user) {
        System.out.println(user.getUsername());

        /*if (u != null) {
            model.put("message", "User exists!");
        }*/

        /*User user = new User();
        user.setUsername(name);
        user.setPassword(password);
        user.setRoles();
        userRepository.save(user);*/
        return "redirect:/login";
    }

}
