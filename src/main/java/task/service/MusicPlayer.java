package task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import task.entity.Music;

@Component
public class MusicPlayer {

    private final Music music1;
    private final Music music2;
    private final Music music3;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2,
                       @Qualifier("rapMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String playMusic() {
        return music1.getSong() + " " + music2.getSong() + " " + music3.getSong();
    }

}