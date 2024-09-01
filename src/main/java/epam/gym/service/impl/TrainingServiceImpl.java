package epam.gym.service.impl;

import epam.gym.dao.TrainingDAO;
import epam.gym.model.model.Training;
import epam.gym.service.TrainingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainingServiceImpl implements TrainingService {

    private TrainingDAO trainingDAO;

    @Autowired
    public void setTrainingDAO(TrainingDAO trainingDAO) {
        this.trainingDAO = trainingDAO;
    }

    @Override
    public Optional<Training> add(Training training) {
        int maxId = trainingDAO.getMaxId();

        training.setTrainingId(maxId);

        return trainingDAO.add(maxId, training);
    }

    @Override
    public Optional<Training> getById(int trainingId) {
        return trainingDAO.getById(trainingId);
    }

    @Override
    public List<Training> getTrainings() {
        return trainingDAO.getTrainings();
    }
}