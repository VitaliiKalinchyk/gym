package epam.gym.model.model;

import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@Setter
@Getter
@EqualsAndHashCode(of = "trainerId", callSuper = false)
@ToString(callSuper = true)
public class Trainer extends User {
    private int trainerId;
    private TrainingType trainingType;
}