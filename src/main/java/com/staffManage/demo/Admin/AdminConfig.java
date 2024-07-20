
package com.staffManage.demo.Admin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AdminConfig {

    @Bean
    CommandLineRunner
    CommandLineRunner(AdminRepository repository) {
        return args -> {

        };
    }
}
