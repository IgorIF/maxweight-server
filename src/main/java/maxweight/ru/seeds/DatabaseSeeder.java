package maxweight.ru.seeds;

import maxweight.ru.models.*;
import maxweight.ru.repositories.*;
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

    @Autowired
    UserRepository userRepository;

    @Autowired
    PlanRepository planRepository;

    @Autowired
    TrainingRepository trainingRepository;

    @Autowired
    PersonalExerciseRepository personalExerciseRepository;


    @EventListener
    public void seed(ContextRefreshedEvent event) {
        seedExercises();
        seedUsers();
        seedPlans();
        seedTrainings();
        seedPersonalExercises();
    }

    private void seedUsers() {
        Set<User> users = new HashSet<>(1);
        users.add(new User("igarif", "1111"));
        userRepository.saveAll(users);
    }

    private void seedPlans() {
        Set<Plan> plans = new HashSet<>(1);
        plans.add(new Plan("План на грудь", userRepository.findFirstByUsername("igarif")));
        planRepository.saveAll(plans);
    }

    private void seedTrainings() {
        Set<Training> trainings = new HashSet<>(1);
        trainings.add(new Training("День жима", planRepository.findFirstByUser(userRepository.findFirstByUsername("igarif"))));
        trainingRepository.saveAll(trainings);
    }

    private void seedExercises() {
        Set<Exercise> exercises = new HashSet<>(3);
        exercises.add(new Exercise("Приседания", "squats"));
        exercises.add(new Exercise("Жим лежа", "bench_press"));
        exercises.add(new Exercise("Становая тяга", "deadlift"));
        exerciseRepository.saveAll(exercises);
    }

    private void seedPersonalExercises() {

        User user = userRepository.findFirstByUsername("igarif");
        Plan plan = planRepository.findFirstByUser(user);
        Training training = trainingRepository.findFirstByPlan(plan);
        Exercise exercise = exerciseRepository.findFirstByAlias("squats");

        Set<PersonalExercise> exercises = new HashSet<>(1);
        exercises.add(new PersonalExercise(training, exercise));
        personalExerciseRepository.saveAll(exercises);
    }
}
