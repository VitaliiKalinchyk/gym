package epam.gym.storage.impl;

import epam.gym.entity.Trainee;
import epam.gym.entity.Trainer;
import epam.gym.entity.Training;
import epam.gym.storage.Storage;
import epam.gym.utils.StorageAnnotation;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@StorageAnnotation
public class InMemoryStorage implements Storage {
    private Map<Long, Trainee> trainees = new HashMap<>();
    private Map<Long, Trainer> trainers = new HashMap<>();
    private Map<Long, Training> trainings = new HashMap<>();
}