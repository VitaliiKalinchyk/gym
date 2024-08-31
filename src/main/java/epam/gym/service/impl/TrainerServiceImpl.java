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
        return trainerDAO.add(trainer);
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
}