package maxweight.ru.seeds;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public abstract class DatabaseSeeder implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        this.seed();
    }

    abstract void seed();
}
