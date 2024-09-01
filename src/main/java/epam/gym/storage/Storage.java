package epam.gym.storage;

import epam.gym.model.model.Trainee;
import epam.gym.model.model.Trainer;
import epam.gym.model.model.Training;

import java.util.Map;

public interface Storage {
    Map<Integer, Trainee> getTrainees();
    void setTrainees(Map<Integer, Trainee> trainees);

    Map<Integer, Trainer> getTrainers();
    void setTrainers(Map<Integer, Trainer> trainers);

    Map<Integer, Training> getTrainings();
    void setTrainings(Map<Integer, Training> trainings);
}