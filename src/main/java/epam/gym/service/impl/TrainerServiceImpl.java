package epam.gym.service.impl;

import epam.gym.dao.TraineeDAO;
import epam.gym.dao.TrainerDAO;
import epam.gym.model.model.Trainer;
import epam.gym.service.TrainerService;

import epam.gym.utils.NameGenerator;
import epam.gym.utils.PasswordGenerator;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class TrainerServiceImpl implements TrainerService {

    private final TrainerDAO trainerDAO;
    private final TraineeDAO traineeDAO;
    private final PasswordGenerator passwordGenerator;
    private final NameGenerator nameGenerator;

    @Override
    public Optional<Trainer> add(Trainer trainer) {
        int maxId = trainerDAO.getMaxId();

        trainer.setTrainerId(maxId);
        trainer.setUsername(generateUsername(trainer));
        trainer.setPassword(passwordGenerator.generatePassword());
        return trainerDAO.add(maxId, trainer);
    }

    @Override
    public Optional<Trainer> edit(Trainer trainer) {
        return trainerDAO.edit(trainer);
    }

    @Override
    public Optional<Trainer> getById(int trainerId) {
        return trainerDAO.getById(trainerId);
    }

    @Override
    public Optional<Trainer> getByUsername(String username) {
        return trainerDAO.getByUsername(username);
    }

    @Override
    public List<Trainer> getTrainers() {
        return trainerDAO.getTrainers();
    }

    private String generateUsername(Trainer trainer) {
        String username = nameGenerator.generateUsername(trainer);
        if (traineeDAO.getByUsername(username).isEmpty() && trainerDAO.getByUsername(username).isEmpty()) {
            return username;
        }
        return nameGenerator.generateUsername(trainer,
                traineeDAO.getAllTraineesByUsername(username),
                trainerDAO.getAllTrainersByUsername(username));
    }
}