package epam.gym.dao.impl;

import epam.gym.dao.TrainerDAO;
import epam.gym.model.model.Trainer;
import epam.gym.utils.annotation.DAO;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@DAO
public class TrainerDAOImpl implements TrainerDAO {
    private Map<Integer, Trainer> trainers;

    @Autowired
    public void setTrainees(Map<Integer, Trainer> trainers) {
        this.trainers = trainers;
    }

    @Override
    public Optional<Trainer> add(int trainerId, Trainer trainee) {
        trainers.put(trainerId, trainee);
        return getById(trainerId);
    }

    @Override
    public Optional<Trainer> edit(Trainer trainer) {
        return Optional.ofNullable(trainers.replace(trainer.getTrainerId(), trainer));
    }

    @Override
    public Optional<Trainer> getById(int trainerId) {
        return Optional.ofNullable(trainers.get(trainerId));
    }

    @Override
    public Optional<Trainer> getByUsername(String username) {
        return trainers.values()
                .stream()
                .filter(trainer -> trainer.getUsername().equals(username))
                .findAny();
    }

    @Override
    public List<Trainer> getTrainers() {
        return new ArrayList<>(trainers.values());
    }

    @Override
    public List<Trainer> getAllTrainersByUsername(String username) {
        return trainers.values()
                .stream()
                .filter(trainee -> trainee.getUsername().matches(username + "\\d+"))
                .collect(Collectors.toList());
    }

    @Override
    public int getMaxId() {
        return trainers.keySet().stream().max(Integer::compareTo).orElse(0) + 1;
    }
}