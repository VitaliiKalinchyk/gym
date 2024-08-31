package epam.gym.utils.impl;

import epam.gym.entity.Trainee;
import epam.gym.entity.Trainer;
import epam.gym.entity.User;
import epam.gym.utils.NameGenerator;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Stream;

@Component
public class NameGeneratorImpl implements NameGenerator {
    @Override
    public String generateUsername(User user) {
        return user.getFirstName() + "." + user.getLastName();
    }

    @Override
    public String generateUsername(User user, List<Trainee> trainees, List<Trainer> trainers) {
        String baseUsername = generateUsername(user);
        int maxIndex = Stream.concat(trainees.stream(), trainers.stream())
                             .map(User::getUsername)
                             .map(userName -> userName.replaceAll("\\D+?(\\d)", "$1"))
                             .mapToInt(Integer::parseInt)
                             .max()
                             .orElse(0);
        return baseUsername + (maxIndex + 1);
    }
}