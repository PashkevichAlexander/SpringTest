import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contex = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Music music = contex.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = contex.getBean("MusicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        contex.close();
    }
}
