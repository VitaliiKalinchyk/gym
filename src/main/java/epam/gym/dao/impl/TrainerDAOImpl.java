package epam.gym.dao.impl;

import epam.gym.dao.TrainerDAO;
import epam.gym.entity.Trainer;
import epam.gym.utils.DAO;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@DAO
public class TrainerDAOImpl implements TrainerDAO {
    private Map<Integer, Trainer> trainers;

    @Autowired
    public void setTrainees(Map<Integer, Trainer> trainers) {
        this.trainers = trainers;
    }

    @Override
    public Optional<Trainer> add(Trainer trainee) {
        Integer maxId = trainers.keySet().stream().max(Integer::compareTo).orElse(0) + 1;
        Trainer result = trainers.put(maxId, trainee);
        return Optional.ofNullable(result);
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
}