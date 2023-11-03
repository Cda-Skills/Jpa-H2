package org.springboot.JpaH2.repository;

import org.springboot.JpaH2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Long>{

	List<User> findByFamille(String famille);
	
	User findByEmailAdress(String emailAdress);
}
