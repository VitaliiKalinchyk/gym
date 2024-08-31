package epam.gym.storage;

import epam.gym.entity.Trainee;
import epam.gym.entity.Trainer;
import epam.gym.entity.Training;

import java.util.Map;

public interface Storage {
    Map<Integer, Trainee> getTrainees();
    Map<Integer, Trainer> getTrainers();
    Map<Integer, Training> getTrainings();
}