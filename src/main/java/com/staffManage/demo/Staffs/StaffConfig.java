package com.staffManage.demo.Staffs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StaffConfig {
    @Bean
    CommandLineRunner commandLineRunner(StaffRepo repo) {

        return args -> {
            Staffs Dated = new Staffs(
                    1,
                    "DATED BY ME",
                    "POBOX12",
                    2777777,
                    10122024
            );


            Staffs Mnyonge = new Staffs(
                    2,
                    "Mnyonge",
                    "POBOX14",
                    777122,
                    4112029
            );
            Staffs Daulat = new Staffs(
                    3,
                    "Daulat",
                    "POBOX20",
                    712288,
                    1212029
            );
            repo.saveAll(
                    List.of(Dated, Mnyonge)
            );


        };
    }
}
