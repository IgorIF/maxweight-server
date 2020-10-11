package maxweight.ru.seeds;

import maxweight.ru.models.Exercise;
import maxweight.ru.repositories.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Component
public class DatabaseSeeder {
    @Autowired
    ExerciseRepository exerciseRepository;

    @EventListener
    public void seed(ContextRefreshedEvent event) {
        seedExercises();
    }

    private void seedExercises() {
        exerciseRepository.save(new Exercise("выфа", "adfdas"));
    }



}
