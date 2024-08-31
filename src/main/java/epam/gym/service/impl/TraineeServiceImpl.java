package epam.gym.service.impl;

import epam.gym.dao.TraineeDAO;
import epam.gym.entity.Trainee;
import epam.gym.service.TraineeService;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class TraineeServiceImpl implements TraineeService {
    private final TraineeDAO traineeDAO;

    @Override
    public Optional<Trainee> add(Trainee trainee) {
        return traineeDAO.add(trainee);
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
}