package epam.gym.service;

import epam.gym.entity.Trainer;

import java.util.List;
import java.util.Optional;

public interface TrainerService {


    Optional<Trainer> add(Trainer trainer);

    Optional<Trainer> edit(Trainer trainer);

    Optional<Trainer> getById(int trainerId);
    Optional<Trainer> getByUsername(String username);

    List<Trainer> getTrainers();
}