package epam.gym.model.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TrainingTest {

    @Test
    void testEqualsAndHashCode() {
        Training training1 = new Training();
        training1.setTrainingId(1);

        Training training2 = new Training();
        training2.setTrainingId(1);

        assertEquals(training1, training2);
        assertEquals(training1.hashCode(), training2.hashCode());
    }

    @Test
    void testNotEqualsAndHashCode() {
        Training training1 = new Training();
        training1.setTrainingId(1);

        Training training2 = new Training();
        training2.setTrainingId(2);

        assertNotEquals(training1, training2);
        assertNotEquals(training1.hashCode(), training2.hashCode());
    }

    @Test
    void testToString() {
        Training training = new Training();
        training.setTrainingId(1);
        training.setTraineeId(1);
        training.setTrainerId(1);
        training.setName("Fast");
        training.setTrainingType(TrainingType.ZUMBA);
        training.setDate(LocalDate.of(1990, 1, 1));
        training.setDurationMinutes(45);

        String expectedToString = "Training(trainingId=1, traineeId=1, trainerId=1, name=Fast, " +
                "trainingType=ZUMBA, date=1990-01-01, durationMinutes=45)";
        assertEquals(expectedToString, training.toString());
    }

    @Test
    void testToStringWithNulls() {
        Training training = new Training();

        String expectedToString = "Training(trainingId=0, traineeId=0, trainerId=0, name=null, " +
                "trainingType=null, date=null, durationMinutes=0)";
        assertEquals(expectedToString, training.toString());
    }
}