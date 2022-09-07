package is.hi.hbv501g.hugbunadarverkefni1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Hugbunadarverkefni1Application {

    //Jökull joj38

    public static void main(String[] args) {
        SpringApplication.run(Hugbunadarverkefni1Application.class, args);
    }


}
