package epam.gym.model.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TraineeTest {

    @Test
    void testEqualsAndHashCode() {
        Trainee trainee1 = new Trainee();
        trainee1.setTraineeId(1);

        Trainee trainee2 = new Trainee();
        trainee2.setTraineeId(1);

        assertEquals(trainee1, trainee2);
        assertEquals(trainee1.hashCode(), trainee2.hashCode());
    }

    @Test
    void testNotEqualsAndHashCode() {
        Trainee trainee1 = new Trainee();
        trainee1.setTraineeId(1);

        Trainee trainee2 = new Trainee();
        trainee2.setTraineeId(2);

        assertNotEquals(trainee1, trainee2);
        assertNotEquals(trainee1.hashCode(), trainee2.hashCode());
    }

    @Test
    void testToString() {
        Trainee trainee = new Trainee();
        trainee.setUserId(1);
        trainee.setTraineeId(1);
        trainee.setFirstName("John");
        trainee.setLastName("Doe");
        trainee.setUsername("John.Doe");
        trainee.setPassword("J1asdAS100");
        trainee.setActive(true);
        trainee.setBirthday(LocalDate.of(1990, 1, 1));
        trainee.setAddress("123 Main St");

        String expectedToString = "Trainee(super=User(userId=1, firstName=John, lastName=Doe, " +
                "username=John.Doe, password=J1asdAS100, isActive=true), traineeId=1, birthday=1990-01-01, " +
                "address=123 Main St)";
        assertEquals(expectedToString, trainee.toString());
    }

    @Test
    void testToStringWithNulls() {
        Trainee trainee = new Trainee();

        String expectedToString = "Trainee(super=User(userId=0, firstName=null, lastName=null, " +
                "username=null, password=null, isActive=false), traineeId=0, birthday=null, " +
                "address=null)";
        assertEquals(expectedToString, trainee.toString());
    }
}