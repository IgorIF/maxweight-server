package maxweight.ru.seeds;

import maxweight.ru.models.Exercise;
import maxweight.ru.repositories.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DatabaseSeeder {
    @Autowired
    ExerciseRepository exerciseRepository;

    @EventListener
    public void seed(ContextRefreshedEvent event) {
        seedExercises();
        seedUsers();
        seedPlans();
        seedTrainings();
    }

    private void seedUsers() {

    }

    private void seedPlans() {

    }

    private void seedTrainings() {

    }

    private void seedExercises() {
        Set<Exercise> exercises = new HashSet<>();
        exercises.add(new Exercise("Приседания", "squats"));
        exercises.add(new Exercise("Жим лежа", "bench_press"));
        exercises.add(new Exercise("Становая тяга", "deadlift"));

        exerciseRepository.saveAll(exercises);
    }
}
