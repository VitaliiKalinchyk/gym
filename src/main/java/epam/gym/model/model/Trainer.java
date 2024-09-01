package epam.gym.model.model;

import lombok.*;

@Setter
@Getter
@EqualsAndHashCode(of = "trainerId", callSuper = false)
@ToString(callSuper = true)
public class Trainer extends User {
    private int trainerId;
    TrainingType trainingType;
}