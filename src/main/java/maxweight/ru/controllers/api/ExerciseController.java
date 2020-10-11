package maxweight.ru.controllers.api;

import maxweight.ru.models.Exercise;
import maxweight.ru.services.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ExerciseController extends BaseController {

    @Autowired
    ExerciseService exerciseService;

    @GetMapping("/exercises")
    public List<Exercise> getExercises() {
       return exerciseService.getAll();
    }

}
