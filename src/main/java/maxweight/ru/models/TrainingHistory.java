package maxweight.ru.models;

import javax.persistence.*;

@Entity
@Table(name = "training_histories")
public class TrainingHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
}
