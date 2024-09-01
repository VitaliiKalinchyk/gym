package epam.gym.utils;

import epam.gym.model.model.Trainee;
import epam.gym.model.model.Trainer;
import epam.gym.model.model.User;

import java.util.List;

public interface NameGenerator {

    String generateUsername(User user);

    String generateUsername(User user, List<Trainee> trainees, List<Trainer> trainers);

}