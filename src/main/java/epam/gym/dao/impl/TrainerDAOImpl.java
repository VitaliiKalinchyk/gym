package epam.gym.dao.impl;

import epam.gym.dao.TrainerDAO;
import epam.gym.entity.Trainer;
import epam.gym.utils.DAO;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

@DAO
public class TrainerDAOImpl implements TrainerDAO {
    private Map<Integer, Trainer> trainers;

    @Autowired
    public void setTrainees(Map<Integer, Trainer> trainers) {
        this.trainers = trainers;
    }

}