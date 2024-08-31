package epam.gym.config;

import epam.gym.entity.Trainee;
import epam.gym.entity.Trainer;
import epam.gym.entity.Training;
import epam.gym.storage.Storage;

import lombok.RequiredArgsConstructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ComponentScan(basePackages = "epam.gym")
@RequiredArgsConstructor
public class GymAppConfig {

    private final Storage storage;

    @Bean
    public Map<Integer, Trainee> trainees() {
        return storage.getTrainees();
    }

    @Bean
    public Map<Integer, Trainer> trainers() {
        return storage.getTrainers();
    }

    @Bean
    public Map<Integer, Training> trainings() {
        return storage.getTrainings();
    }

}