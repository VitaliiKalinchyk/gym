package epam.gym.service;

import epam.gym.model.model.Training;

import java.util.List;
import java.util.Optional;

public interface TrainingService {

    Optional<Training> add(Training training);

    Optional<Training> getById(int trainingId);

    List<Training> getTrainings();
}