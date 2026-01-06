package com.my_project.demo_store;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.my_project.demo_store.entities.Address;
import com.my_project.demo_store.entities.Profile;
import com.my_project.demo_store.entities.Tag;
import com.my_project.demo_store.entities.User;
import com.my_project.demo_store.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoStoreApplication {

    public static void main(String[] args) {

        ApplicationContext context =  SpringApplication.run(DemoStoreApplication.class, args);
        var repository = context.getBean(UserRepository.class);

        repository.deleteById(1L);

    }

}
