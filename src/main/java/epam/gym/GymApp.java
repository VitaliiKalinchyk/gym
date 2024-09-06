package epam.gym;

import epam.gym.config.GymAppConfig;
import epam.gym.facade.GymFacade;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class GymApp {
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(GymAppConfig.class);

        GymFacade facade = context.getBean(GymFacade.class);

        System.out.println(facade.trainerService().getTrainers());
    }
}