package epam.gym.utils.impl;

import epam.gym.model.model.Trainee;
import epam.gym.model.model.Trainer;
import epam.gym.model.model.User;
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

        Stream<User> users = Stream.concat(trainees.stream(), trainers.stream());
        int maxIndex = users.map(User::getUsername)
                             .map(userName -> userName.replaceAll("\\D+?(\\d+)$", "$1"))
                             .filter(s -> !s.isEmpty())
                             .mapToInt(Integer::parseInt)
                             .max()
                             .orElse(0);

        return baseUsername + (maxIndex + 1);
    }
}