package epam.gym.service.impl;

import epam.gym.dao.TraineeDAO;
import epam.gym.dao.TrainerDAO;
import epam.gym.model.model.Trainee;
import epam.gym.service.TraineeService;
import epam.gym.utils.NameGenerator;
import epam.gym.utils.PasswordGenerator;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class TraineeServiceImpl implements TraineeService {

    private final TraineeDAO traineeDAO;
    private final TrainerDAO trainerDAO;
    private final PasswordGenerator passwordGenerator;
    private final NameGenerator nameGenerator;

    @Override
    public Optional<Trainee> add(Trainee trainee) {
        int maxId = traineeDAO.getMaxId();

        trainee.setTraineeId(maxId);
        trainee.setUsername(generateUsername(trainee));
        trainee.setPassword(passwordGenerator.generatePassword());

        return traineeDAO.add(maxId, trainee);
    }

    @Override
    public Optional<Trainee> edit(Trainee trainee) {
        return traineeDAO.edit(trainee);
    }

    @Override
    public boolean delete(int traineeId) {
        return traineeDAO.delete(traineeId);
    }

    @Override
    public Optional<Trainee> getById(int traineeId) {
        return traineeDAO.getById(traineeId);
    }

    @Override
    public Optional<Trainee> getByUsername(String username) {
        return traineeDAO.getByUsername(username);
    }

    @Override
    public List<Trainee> getTrainees() {
        return traineeDAO.getTrainees();
    }

    private String generateUsername(Trainee trainee) {
        String username = nameGenerator.generateUsername(trainee);

        if (traineeDAO.getByUsername(username).isEmpty() && trainerDAO.getByUsername(username).isEmpty()) {
            return username;
        }

        return nameGenerator.generateUsername(trainee,
                traineeDAO.getAllTraineesByUsername(username),
                trainerDAO.getAllTrainersByUsername(username));
    }
}