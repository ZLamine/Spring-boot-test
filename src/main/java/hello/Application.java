package hello;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({com.vpdigital.MetricsComponents.class})
public class Application {

    public static void main(String[] args) {

        System.out.println("Let's inspect the beans provided by Spring Boot:");
        
        String[] beanNames = new SpringApplicationBuilder(Application.class)
                .run(args).getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

}
