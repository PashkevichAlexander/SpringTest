package task.app;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("task.entity")
@ComponentScan("task.service")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
