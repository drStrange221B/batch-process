package com.batch.emrys.batchprocess.batch;

import com.batch.emrys.batchprocess.model.User;
import com.batch.emrys.batchprocess.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Slf4j
public class DBWriter implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void write(List<? extends User> users) throws Exception {

        log.info("Data Saved for Users: " + users);

          userRepository.saveAll(users);

    }
}
