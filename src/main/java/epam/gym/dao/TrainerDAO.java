package epam.gym.dao;

import epam.gym.entity.Trainer;

import java.util.List;
import java.util.Optional;

public interface TrainerDAO {

    Optional<Trainer> add(Trainer trainee);

    Optional<Trainer> edit(Trainer trainer);

    Optional<Trainer> getById(int trainerId);
    Optional<Trainer> getByUsername(String username);

    List<Trainer> getTrainers();
}