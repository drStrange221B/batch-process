package com.batch.emrys.batchprocess.repository;

import com.batch.emrys.batchprocess.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
