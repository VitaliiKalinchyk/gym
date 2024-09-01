package epam.gym.storage;

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import epam.gym.model.model.Trainee;
import epam.gym.model.model.Trainer;
import epam.gym.model.model.Training;
import epam.gym.model.entity.YamlDataContainer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class StorageInitializer {

    @Value("${file.path.initialData}")
    private Resource resource;

    private Storage storage;

    @Autowired
    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    @PostConstruct
    public void initialize() {
        ObjectMapper om = new ObjectMapper(new YAMLFactory());

        om.registerModule(new JavaTimeModule()); // Реєстрація модуля для Java 8 дати і часу
        om.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));

        try (InputStream inputStream = resource.getInputStream()) {
            YamlDataContainer root = om.readValue(inputStream, YamlDataContainer.class);

            storage.setTrainees(root.getTrainees().stream()
                    .collect(Collectors.toMap(Trainee::getTraineeId, Function.identity())));

            storage.setTrainers(root.getTrainers().stream()
                    .collect(Collectors.toMap(Trainer::getTrainerId, Function.identity())));

            storage.setTrainings(root.getTrainings().stream()
                    .collect(Collectors.toMap(Training::getTrainingId, Function.identity())));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}