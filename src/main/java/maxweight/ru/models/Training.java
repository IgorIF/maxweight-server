package maxweight.ru.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "trainings")
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "plan_id", nullable = false)
    private Plan plan;

    @OneToMany(mappedBy = "trainings")
    List<PersonalExercise> exercises;

    public Training() {
    }

    public Training(String name, Plan plan) {
        this.name = name;
        this.plan = plan;
    }
}
