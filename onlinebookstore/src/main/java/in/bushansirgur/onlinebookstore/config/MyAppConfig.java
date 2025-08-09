package in.bushansirgur.onlinebookstore.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class MyAppConfig implements WebMvcConfigurer {

    // Removed CORS config to avoid conflicts. Use CorsConfig.java only.
}
