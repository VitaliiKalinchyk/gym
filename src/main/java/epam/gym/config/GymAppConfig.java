package epam.gym.config;

import epam.gym.entity.Trainee;
import epam.gym.entity.Trainer;
import epam.gym.entity.Training;
import epam.gym.storage.Storage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ComponentScan(basePackages = "epam.gym")
public class GymAppConfig {

    private Storage storage;

    @Autowired
    public void setStorage(Storage storage) {
        this.storage = storage;
    }

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