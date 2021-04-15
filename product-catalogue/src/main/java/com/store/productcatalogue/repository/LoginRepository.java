/*package com.store.productcatalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.store.productcatalogue.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, String> {
	
	@Query(value="Select * from login where username= ?1 and password= ?2", nativeQuery=true)
	Login findUser(String username, String password);

}
*/