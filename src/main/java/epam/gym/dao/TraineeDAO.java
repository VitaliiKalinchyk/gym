package epam.gym.dao;

import epam.gym.entity.Trainee;

import java.util.List;
import java.util.Optional;

public interface TraineeDAO {

    Optional<Trainee> add(int traineeId, Trainee trainee);

    Optional<Trainee> edit(Trainee trainee);

    boolean delete(int traineeId);

    Optional<Trainee> getById(int traineeId);

    Optional<Trainee> getByUsername(String username);

    List<Trainee> getTrainees();

    List<Trainee> getAllTraineesByUsername(String username);

    int getMaxId();
}