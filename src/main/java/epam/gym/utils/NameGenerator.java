package epam.gym.utils;

import epam.gym.entity.Trainee;
import epam.gym.entity.Trainer;
import epam.gym.entity.User;

import java.util.List;

public interface NameGenerator {

    String generateUsername(User user);

    String generateUsername(User user, List<Trainee> trainees, List<Trainer> trainers);

}