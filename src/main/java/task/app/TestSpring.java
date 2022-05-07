package task.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import task.service.Computer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void run() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.toString());
        System.out.println(computer.getMusicPlayer().getName());
        System.out.println(computer.getMusicPlayer().getVolume());
        context.close();

    }
}
