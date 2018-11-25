package com.study.spring;




import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsrRepository extends MongoRepository<User, String> {

	public List<User> findAll();

	public User findOne(String username);
	
}
