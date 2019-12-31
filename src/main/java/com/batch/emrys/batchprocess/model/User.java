package com.batch.emrys.batchprocess.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.stream.StreamSupport;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Id
    private Integer id;
    private String name;
    private String dept;
    private Integer salary;
}

