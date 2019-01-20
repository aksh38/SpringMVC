package com.bridgelabz.jpa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.bridgelabz.jpa.models.UserInfo;


@Repository
public interface UserRepository extends CrudRepository<UserInfo, String>{

}
