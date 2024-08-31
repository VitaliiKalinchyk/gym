package epam.gym.storage.impl;

import epam.gym.entity.Trainee;
import epam.gym.entity.Trainer;
import epam.gym.entity.Training;
import epam.gym.storage.Storage;
import epam.gym.utils.annotation.StorageAnnotation;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@StorageAnnotation
public class InMemoryStorage implements Storage {
    private Map<Integer, Trainee> trainees = new HashMap<>();
    private Map<Integer, Trainer> trainers = new HashMap<>();
    private Map<Integer, Training> trainings = new HashMap<>();
}