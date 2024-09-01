package epam.gym.dao;

import epam.gym.model.model.Training;

import java.util.List;
import java.util.Optional;

public interface TrainingDAO {
    Optional<Training> add(int trainingId, Training training);

    Optional<Training> getById(int trainingId);

    List<Training> getTrainings();

    int getMaxId();
}