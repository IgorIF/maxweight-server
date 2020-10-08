package maxweight.ru.seeds;

import maxweight.ru.models.Exercise;
import maxweight.ru.repositories.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class ExerciseSeeder extends DatabaseSeeder {

    @Autowired
    ExerciseRepository exerciseRepository;

    @Override
    void seed() {
        Set<Exercise> exercises = new HashSet<>();
        exercises.add(new Exercise());
        exercises.add(new Exercise());
        exercises.add(new Exercise());
        exercises.add(new Exercise());
        exercises.add(new Exercise());

        exerciseRepository.saveAll(exercises);
    }
}
