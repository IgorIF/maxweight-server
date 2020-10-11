package maxweight.ru.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "exercises_personal")
public class PersonalExercise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "training_id", nullable = false)
    Training training;

    @ManyToOne
    @JoinColumn(name = "exercise_id", nullable = false)
    Exercise exercise;

    //List<Approach> approaches;

    public class Approach {
        private long id;
        private long weight;
        private long repetition;
    }

    public PersonalExercise() {
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
