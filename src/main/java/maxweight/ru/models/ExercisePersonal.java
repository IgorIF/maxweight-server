package maxweight.ru.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "exercises_personal")
public class ExercisePersonal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    Training training;

    Exercise exercise;

    List<Approach> approaches;

    public class Approach {
        private long id;
        private long weight;
        private long repetition;
    }

}
