package cn.czq.personSpace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@ComponentScan(basePackages = "cn.czq.personSpace.mapper")
public class MybatisXmlApplication {

    public static void main(String[] args) {

        SpringApplication.run(MybatisXmlApplication.class, args);

    }

    @Configuration
//ctrl+o找一下这个方法
    public class WebMVcConfig implements WebMvcConfigurer {
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("**").allowedOrigins("http://localhost:8888")
                    .allowedHeaders("*")
                    .allowedMethods("*")
                    .maxAge(30 * 1000);
        }
    }
}
