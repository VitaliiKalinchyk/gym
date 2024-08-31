package epam.gym.service;

import epam.gym.entity.Training;

import java.util.List;
import java.util.Optional;

public interface TrainingService {

    Optional<Training> add(Training training);

    Optional<Training> getById(int trainingId);

    Optional<Training> getByName(String name);

    List<Training> getTrainings();
}