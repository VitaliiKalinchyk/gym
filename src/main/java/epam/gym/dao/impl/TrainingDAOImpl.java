package epam.gym.dao.impl;

import epam.gym.dao.TrainingDAO;
import epam.gym.model.model.Training;
import epam.gym.utils.annotation.DAO;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@DAO
public class TrainingDAOImpl implements TrainingDAO {
    private Map<Integer, Training> trainings;

    @Autowired
    public void setTrainees(Map<Integer, Training> trainings) {
        this.trainings = trainings;
    }

    @Override
    public Optional<Training> add(int trainingId, Training training) {
        trainings.put(trainingId, training);
        return getById(trainingId);
    }

    @Override
    public Optional<Training> getById(int trainingId) {
        return Optional.ofNullable(trainings.get(trainingId));
    }

    @Override
    public List<Training> getTrainings() {
        return new ArrayList<>(trainings.values());
    }

    @Override
    public int getMaxId() {
        return trainings.keySet().stream().max(Integer::compareTo).orElse(0) + 1;
    }
}