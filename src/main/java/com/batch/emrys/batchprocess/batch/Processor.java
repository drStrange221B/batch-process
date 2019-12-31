package com.batch.emrys.batchprocess.batch;

import com.batch.emrys.batchprocess.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Slf4j
public class Processor implements ItemProcessor<User,User> {

    private static final Map<String,String> DEPT_NAMES = new HashMap<>();

    public Processor()
    {
        DEPT_NAMES.put("001","Technology");
        DEPT_NAMES.put("002","Operations");
        DEPT_NAMES.put("003","Accounts");


    }

    @Override
    public User process(User user) throws Exception {
        String deptCode = user.getDept();
        String dept = DEPT_NAMES.get(deptCode);
        user.setDept(dept);
        log.info("Converted from [%s] to [%s]", deptCode, dept);
        return user;
    }
}
