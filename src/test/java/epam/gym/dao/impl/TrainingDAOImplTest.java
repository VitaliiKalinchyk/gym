package epam.gym.dao.impl;

import epam.gym.model.model.Training;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class TrainingDAOImplTest {

    private AutoCloseable closeable;

    @InjectMocks
    private TrainingDAOImpl trainingDAO;

    @Mock
    private Map<Integer, Training> trainings;

    @BeforeEach
    public void setUp() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    public void tearDown() throws Exception {
        if (closeable != null) {
            closeable.close();
        }
    }

    @Test
    public void testAdd() {
        Training training = new Training();
        int trainingId = 1;
        training.setTrainingId(trainingId);

        when(trainings.put(eq(trainingId), any(Training.class))).thenReturn(null);
        when(trainings.get(trainingId)).thenReturn(training);

        Optional<Training> result = trainingDAO.add(trainingId, training);

        assertTrue(result.isPresent());
        assertEquals(training, result.get());
        verify(trainings).put(eq(trainingId), any(Training.class));
        verify(trainings).get(trainingId);
    }

    @Test
    public void testGetById() {
        Training training = new Training();
        int trainingId = 1;
        training.setTrainingId(trainingId);

        when(trainings.get(trainingId)).thenReturn(training);

        Optional<Training> result = trainingDAO.getById(trainingId);

        assertTrue(result.isPresent());
        assertEquals(training, result.get());
        verify(trainings).get(trainingId);
    }

    @Test
    public void testGetTrainings() {
        Training training1 = new Training();
        Training training2 = new Training();
        when(trainings.values()).thenReturn(Arrays.asList(training1, training2));

        List<Training> result = trainingDAO.getTrainings();

        assertEquals(2, result.size());
        assertTrue(result.contains(training1));
        assertTrue(result.contains(training2));
        verify(trainings).values();
    }

    @Test
    public void testGetMaxId() {
        when(trainings.keySet()).thenReturn(new HashSet<>(Arrays.asList(1, 2, 3)));

        int result = trainingDAO.getMaxId();

        assertEquals(4, result);
        verify(trainings).keySet();
    }

    @Test
    public void testGetMaxIdWhenNoTrainings() {
        when(trainings.keySet()).thenReturn(Collections.emptySet());

        int result = trainingDAO.getMaxId();

        assertEquals(1, result);
        verify(trainings).keySet();
    }
}