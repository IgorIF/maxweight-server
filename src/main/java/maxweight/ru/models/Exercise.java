package maxweight.ru.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "exercises")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String alias;

    @OneToMany(mappedBy = "exercise")
    private Set<PersonalExercise> personalExercise;

    public Exercise() {
    }

    public Exercise(String name, String alias) {
        this.name = name;
        this.alias = alias;
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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
