package me.hfox.iracing.matrix;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MatrixApplication {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(MatrixApplication.class);
        builder.bannerMode(Banner.Mode.OFF);
        ConfigurableApplicationContext app = builder.run(args);
    }

}
