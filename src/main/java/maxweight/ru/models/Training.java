package maxweight.ru.models;

import javax.persistence.*;

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

}
