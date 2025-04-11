package web.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("web")
@Import({HibernateConfig.class, WebConfig.class})
public class AppConfig {
}