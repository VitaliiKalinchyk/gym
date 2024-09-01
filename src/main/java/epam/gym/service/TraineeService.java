package epam.gym.service;

import epam.gym.model.model.Trainee;

import java.util.List;
import java.util.Optional;

public interface TraineeService {

    Optional<Trainee> add(Trainee trainee);

    Optional<Trainee> edit(Trainee trainee);

    boolean delete(int traineeId);

    Optional<Trainee> getById(int traineeId);
    Optional<Trainee> getByUsername(String username);

    List<Trainee> getTrainees();
}