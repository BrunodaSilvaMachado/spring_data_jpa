package dio.aula.aula_spring_data_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula.aula_spring_data_jpa.model.User;
import dio.aula.aula_spring_data_jpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner{

    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Bruno");
        user.setUsername("bruno");
        user.setPassword("123345");

        User user2 = new User();
        user2.setName("Caju");
        user2.setUsername("Caju");
        user2.setPassword("123345");

        User user3 = new User();
        user3.setName("Ana");
        user3.setUsername("Ana");
        user3.setPassword("123345");

        repository.save(user);
        repository.save(user2);
        repository.save(user3);
        repository.findAll().forEach(System.out::println);
    }
    
}
