package com.my_project.demo_store;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.my_project.demo_store.entities.Address;
import com.my_project.demo_store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoStoreApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoStoreApplication.class, args);
        var user = User.builder()
                .name("John")
                .password("password")
                .email("john@example.com")
                .build();

        var address = Address.builder()
                .street("Street")
                .city("City")
                .state("State")
                .zip("Zip")
                .build();

        user.addAddress(address);
        System.out.println(user);
    }

}
