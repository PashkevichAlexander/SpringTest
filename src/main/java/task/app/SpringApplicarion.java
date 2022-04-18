package task.app;

import org.springframework.boot.ApplicationArguments;
import task.service.MusicPlayer;
import task.entity.ClassicalMusic;
import task.entity.RockMusic;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicarion {
    public static void run(ApplicationArguments arg0) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        RockMusic rockMusic = context.getBean("musicBean1", RockMusic.class);
        System.out.println(rockMusic.getSong());

        ClassicalMusic classicalMusic = context.getBean("musicBean2", ClassicalMusic.class);
        ClassicalMusic classicalMusic1 = context.getBean("musicBean2", ClassicalMusic.class);
        System.out.println(classicalMusic.equals(classicalMusic1));



        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
