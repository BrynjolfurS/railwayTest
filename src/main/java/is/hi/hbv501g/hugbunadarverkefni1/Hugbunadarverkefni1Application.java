package is.hi.hbv501g.hugbunadarverkefni1;

// Ólafur Pálsson
// Jökull
// Ólafur Pálsson - olp10@hi.is

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Hugbunadarverkefni1Application {



    public static void main(String[] args) {
        SpringApplication.run(Hugbunadarverkefni1Application.class, args);
    }


}
