package epam.gym.model.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    void testEqualsAndHashCode() {
        Trainer trainer1 = new Trainer();
        trainer1.setTrainerId(1);

        Trainer trainer2 = new Trainer();
        trainer2.setTrainerId(1);

        assertEquals(trainer1, trainer2);
        assertEquals(trainer1.hashCode(), trainer2.hashCode());
    }

    @Test
    void testNotEqualsAndHashCode() {
        Trainer trainer1 = new Trainer();
        trainer1.setTrainerId(1);

        Trainer trainer2 = new Trainer();
        trainer2.setTrainerId(2);

        assertNotEquals(trainer1, trainer2);
        assertNotEquals(trainer1.hashCode(), trainer2.hashCode());
    }

    @Test
    void testToString() {
        Trainer trainer = new Trainer();
        trainer.setUserId(1);
        trainer.setTrainerId(1);
        trainer.setFirstName("John");
        trainer.setLastName("Doe");
        trainer.setUsername("John.Doe");
        trainer.setPassword("J1asdAS100");
        trainer.setActive(true);
        trainer.setTrainingType(TrainingType.YOGA);

        String expectedToString = "Trainer(super=User(userId=1, firstName=John, lastName=Doe, " +
                "username=John.Doe, password=J1asdAS100, isActive=true), trainerId=1, trainingType=YOGA)";
        assertEquals(expectedToString, trainer.toString());
    }

    @Test
    void testToStringWithNulls() {
        Trainer trainer = new Trainer();

        String expectedToString = "Trainer(super=User(userId=0, firstName=null, lastName=null, " +
                "username=null, password=null, isActive=false), trainerId=0, trainingType=null)";
        assertEquals(expectedToString, trainer.toString());
    }
}