package epam.gym.model.model;

import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

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