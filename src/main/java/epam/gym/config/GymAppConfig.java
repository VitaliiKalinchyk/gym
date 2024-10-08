package epam.gym.config;

import epam.gym.model.model.Trainee;
import epam.gym.model.model.Trainer;
import epam.gym.model.model.Training;
import epam.gym.storage.Storage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.DependsOn;

import java.util.Map;

@Configuration
@ComponentScan(basePackages = "epam.gym")
@PropertySource("classpath:application.properties")
public class GymAppConfig {

    private final Storage storage;

    @Autowired
    public GymAppConfig(Storage storage) {
        this.storage = storage;
    }

    @Bean
    @DependsOn("storageInitializer")
    public Map<Integer, Trainee> trainees() {
        return storage.getTrainees();
    }

    @Bean
    @DependsOn("storageInitializer")
    public Map<Integer, Trainer> trainers() {
        return storage.getTrainers();
    }


    @Bean
    @DependsOn("storageInitializer")
    public Map<Integer, Training> trainings() {
        return storage.getTrainings();
    }
}