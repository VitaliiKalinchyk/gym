package epam.gym.dao.impl;

import epam.gym.dao.TrainingDAO;
import epam.gym.entity.Training;
import epam.gym.utils.DAO;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

@DAO
public class TrainingDAOImpl implements TrainingDAO {
    private Map<Integer, Training> trainings;

    @Autowired
    public void setTrainees(Map<Integer, Training> trainings) {
        this.trainings = trainings;
    }

}