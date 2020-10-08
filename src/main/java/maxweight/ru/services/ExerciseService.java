package maxweight.ru.services;

import maxweight.ru.models.Exercise;
import maxweight.ru.repositories.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseService {
    @Autowired
    ExerciseRepository exerciseRepository;

    public List<Exercise> getAll() {
        return exerciseRepository.findAll();
    }
}
