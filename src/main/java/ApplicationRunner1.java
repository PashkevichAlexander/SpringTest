import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import task.app.SpringApplicarion;

@SpringBootApplication
public class DemoApplication implements org.springframework.boot.ApplicationRunner {
    public static void main(String[] args) {
        SpringApplicarion.run(SpringApplicarion.class, args);
    }
    @Override
    public void run(ApplicationArguments arg0) throws Exception {
        System.out.println("Hello World from Application Runner");
    }
}
