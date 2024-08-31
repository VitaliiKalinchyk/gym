package epam.gym.dao.impl;

import epam.gym.dao.TraineeDAO;
import epam.gym.entity.Trainee;
import epam.gym.utils.annotation.DAO;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@DAO
public class TraineeDAOImpl implements TraineeDAO {
    private Map<Integer, Trainee> trainees;

    @Autowired
    public void setTrainees(Map<Integer, Trainee> trainees) {
        this.trainees = trainees;
    }

    @Override
    public Optional<Trainee> add(Trainee trainee) {
        Integer maxId = trainees.keySet().stream().max(Integer::compareTo).orElse(0) + 1;
        Trainee result = trainees.put(maxId, trainee);
        return Optional.ofNullable(result);
    }

    @Override
    public Optional<Trainee> edit(Trainee trainee) {
        return Optional.ofNullable(trainees.replace(trainee.getTraineeId(), trainee));
    }

    @Override
    public boolean delete(int traineeId) {
        return trainees.remove(traineeId) != null;
    }

    @Override
    public Optional<Trainee> getById(int traineeId) {
        return Optional.ofNullable(trainees.get(traineeId));
    }

    @Override
    public Optional<Trainee> getByUsername(String username) {
        return trainees.values()
                       .stream()
                       .filter(trainee -> trainee.getUsername().equals(username))
                       .findAny();
    }

    @Override
    public List<Trainee> getTrainees() {
        return new ArrayList<>(trainees.values());
    }
}