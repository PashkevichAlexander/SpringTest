import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
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
