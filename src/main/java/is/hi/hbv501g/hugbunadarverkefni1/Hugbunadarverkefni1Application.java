package is.hi.hbv501g.hugbunadarverkefni1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Hugbunadarverkefni1Application implements ErrorController {

    public static void main(String[] args) {
        SpringApplication.run(Hugbunadarverkefni1Application.class, args);
    }
}
