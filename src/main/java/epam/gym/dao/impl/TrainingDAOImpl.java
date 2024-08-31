package epam.gym.dao.impl;

import epam.gym.dao.TrainingDAO;
import epam.gym.entity.Training;
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
    public Optional<Training> add(Training training) {
        Integer maxId = trainings.keySet().stream().max(Integer::compareTo).orElse(0) + 1;
        Training result = trainings.put(maxId, training);
        return Optional.ofNullable(result);
    }

    @Override
    public Optional<Training> getById(int trainingId) {
        return Optional.ofNullable(trainings.get(trainingId));
    }

    @Override
    public Optional<Training> getByName(String name) {
        return trainings.values()
                .stream()
                .filter(training -> training.getName().equals(name))
                .findAny();
    }

    @Override
    public List<Training> getTrainings() {
        return new ArrayList<>(trainings.values());
    }
}