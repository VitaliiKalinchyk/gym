package epam.gym.model.model;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@EqualsAndHashCode(of = "traineeId", callSuper = false)
@ToString(callSuper = true)
public class Trainee extends User {
    private int traineeId;
    private LocalDate birthday;
    private String address;
}