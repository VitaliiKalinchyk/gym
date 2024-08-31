package epam.gym.storage;

import epam.gym.entity.Trainee;
import epam.gym.entity.Trainer;
import epam.gym.entity.Training;

import java.util.Map;

public interface Storage {
    Map<Long, Trainee> getTrainees();
    Map<Long, Trainer> getTrainers();
    Map<Long, Training> getTrainings();
}