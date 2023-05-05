package dio.aula.aula_spring_data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dio.aula.aula_spring_data_jpa.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    
}
