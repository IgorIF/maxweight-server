package maxweight.ru.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "personal_exercises")
public class PersonalExercise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "training_id", nullable = false)
    private Training training;

    @ManyToOne
    @JoinColumn(name = "exercise_id", nullable = false)
    private Exercise exercise;

    //List<Approach> approaches;

    public class Approach {
        private long id;
        private long weight;
        private long repetition;
    }

    public PersonalExercise() {
    }

    public PersonalExercise(Training training, Exercise exercise) {
        this.training = training;
        this.exercise = exercise;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }
}
