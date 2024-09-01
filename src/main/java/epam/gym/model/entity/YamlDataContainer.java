package epam.gym.model.entity;

import epam.gym.model.model.Trainee;
import epam.gym.model.model.Trainer;
import epam.gym.model.model.Training;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class YamlDataContainer {
    private final List<Trainee> trainees = new ArrayList<>();
    private final List<Trainer> trainers = new ArrayList<>();
    private final List<Training> trainings = new ArrayList<>();
}