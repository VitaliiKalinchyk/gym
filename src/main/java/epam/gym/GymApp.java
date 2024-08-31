package epam.gym;

import epam.gym.config.GymAppConfig;
import epam.gym.entity.Trainee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class GymApp {
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(GymAppConfig.class);

        Map<Integer, Trainee> trainees = context.getBean("trainees", Map.class);

        trainees.put(1, new Trainee());

        System.out.println(trainees.get(1));
    }
}