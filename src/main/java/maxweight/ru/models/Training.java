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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public List<PersonalExercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<PersonalExercise> exercises) {
        this.exercises = exercises;
    }
}
