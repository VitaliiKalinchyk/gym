package epam.gym.service.impl;

import epam.gym.dao.TrainerDAO;
import epam.gym.entity.Trainer;
import epam.gym.service.TrainerService;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class TrainerServiceImpl implements TrainerService {
    private final TrainerDAO trainerDAO;

    @Override
    public Optional<Trainer> add(Trainer trainer) {
        return Optional.empty();
    }

    @Override
    public Optional<Trainer> edit(Trainer trainer) {
        return Optional.empty();
    }

    @Override
    public Optional<Trainer> getById(int trainerId) {
        return Optional.empty();
    }

    @Override
    public Optional<Trainer> getByUsername(String username) {
        return Optional.empty();
    }

    @Override
    public List<Trainer> getTrainers() {
        return null;
    }
}