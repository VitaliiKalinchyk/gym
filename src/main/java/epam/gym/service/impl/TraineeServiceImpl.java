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
        return Optional.empty();
    }

    @Override
    public Optional<Trainee> edit(Trainee trainee) {
        return Optional.empty();
    }

    @Override
    public boolean delete(int traineeId) {
        return false;
    }

    @Override
    public Optional<Trainee> getById(int traineeId) {
        return Optional.empty();
    }

    @Override
    public Optional<Trainee> getByUsername(String username) {
        return Optional.empty();
    }

    @Override
    public List<Trainee> getTrainees() {
        return null;
    }
}