package epam.gym.service.impl;

import epam.gym.dao.TrainingDAO;
import epam.gym.entity.Training;
import epam.gym.service.TrainingService;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class TrainingServiceImpl implements TrainingService {
    private final TrainingDAO trainingDAO;

    @Override
    public Optional<Training> add(Training training) {
        return Optional.empty();
    }

    @Override
    public Optional<Training> getById(int trainingId) {
        return Optional.empty();
    }

    @Override
    public Optional<Training> getByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Training> getTrainings() {
        return null;
    }
}