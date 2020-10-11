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

    @OneToMany(mappedBy = "personalExercise")
    private List<Approach> approaches;

    @Entity
    @Table(name = "approaches")
    public class Approach {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        private long weight;
        private long repetition;

        @ManyToOne
        @JoinColumn(name = "personal_exercise_id", nullable = false)
        private PersonalExercise personalExercise;

        public Approach() {
        }

        public Approach(long weight, long repetition, PersonalExercise personalExercise) {
            this.weight = weight;
            this.repetition = repetition;
            this.personalExercise = personalExercise;
        }

        public long getWeight() {
            return weight;
        }

        public void setWeight(long weight) {
            this.weight = weight;
        }

        public long getRepetition() {
            return repetition;
        }

        public void setRepetition(long repetition) {
            this.repetition = repetition;
        }

        public PersonalExercise getPersonalExercise() {
            return personalExercise;
        }

        public void setPersonalExercise(PersonalExercise personalExercise) {
            this.personalExercise = personalExercise;
        }
    }

    public PersonalExercise() {
    }

    public PersonalExercise(Training training, Exercise exercise) {
        this.training = training;
        this.exercise = exercise;
    }

    public PersonalExercise(Training training, Exercise exercise, List<Approach> approaches) {
        this.training = training;
        this.exercise = exercise;
        this.approaches = approaches;
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

    public List<Approach> getApproaches() {
        return approaches;
    }

    public void setApproaches(List<Approach> approaches) {
        this.approaches = approaches;
    }
}
