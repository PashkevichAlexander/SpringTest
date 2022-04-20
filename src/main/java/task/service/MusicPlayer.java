package task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import task.entity.ClassicalMusic;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }

    public void playMusic() {
        System.out.println(classicalMusic.getSong());
    }

}