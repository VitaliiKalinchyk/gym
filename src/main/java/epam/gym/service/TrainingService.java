package epam.gym.service;

import epam.gym.entity.Training;

import java.util.List;
import java.util.Optional;

public interface TrainingService {

    Optional<Training> add(int trainingId, Training training);

    Optional<Training> getById(int trainingId);

    List<Training> getTrainings();
}