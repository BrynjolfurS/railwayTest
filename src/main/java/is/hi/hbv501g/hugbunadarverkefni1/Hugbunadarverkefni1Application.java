package is.hi.hbv501g.hugbunadarverkefni1;

// Jökull
// Ólafur Pálsson - olp10@hi.is
// Kristófer Darri
// Brynjólfur Steingrímsson - brs26@hi.is

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Hugbunadarverkefni1Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(Hugbunadarverkefni1Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Hugbunadarverkefni1Application.class, args);
    }

}
