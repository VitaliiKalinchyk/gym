package epam.gym.model.entity;

import epam.gym.model.model.Trainee;
import epam.gym.model.model.Trainer;
import epam.gym.model.model.Training;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class YamlDataContainer {
    private List<Trainee> trainees;
    private List<Trainer> trainers;
    private List<Training> trainings;
}