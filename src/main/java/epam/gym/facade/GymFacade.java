package epam.gym.facade;

import epam.gym.service.TraineeService;
import epam.gym.service.TrainerService;
import epam.gym.service.TrainingService;
import epam.gym.utils.annotation.Facade;

import lombok.RequiredArgsConstructor;

@Facade
@RequiredArgsConstructor
public class GymFacade {
    private final TraineeService traineeService;
    private final TrainerService trainerService;
    private final TrainingService trainingService;
}