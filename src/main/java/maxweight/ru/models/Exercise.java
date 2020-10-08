package maxweight.ru.models;

import javax.persistence.*;

@Entity
@Table(name = "exercises")
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String alias;

    public Exercise() {
    }

    public Exercise(String name, String alias) {
        this.name = name;
        this.alias = alias;
    }
}
