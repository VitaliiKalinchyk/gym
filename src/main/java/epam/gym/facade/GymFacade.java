package epam.gym.facade;

import epam.gym.service.TraineeService;
import epam.gym.service.TrainerService;
import epam.gym.service.TrainingService;
import epam.gym.utils.annotation.Facade;

@Facade
public record GymFacade(TraineeService traineeService,
                        TrainerService trainerService,
                        TrainingService trainingService) {
}