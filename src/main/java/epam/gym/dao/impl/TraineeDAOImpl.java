package epam.gym.dao.impl;

import epam.gym.dao.TraineeDAO;
import epam.gym.entity.Trainee;
import epam.gym.utils.DAO;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

@DAO
public class TraineeDAOImpl implements TraineeDAO {
    private Map<Integer, Trainee> trainees;

    @Autowired
    public void setTrainees(Map<Integer, Trainee> trainees) {
        this.trainees = trainees;
    }

}