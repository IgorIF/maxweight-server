package maxweight.ru.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "exercises_personal")
public class PersonalExercise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "training_id")
    Training training;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "exercise_id")
    Exercise exercise;

    //List<Approach> approaches;

    public class Approach {
        private long id;
        private long weight;
        private long repetition;
    }

}
