package com.springmvc.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private Boolean gender;

    public User(Integer id, String name, Boolean gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
}
