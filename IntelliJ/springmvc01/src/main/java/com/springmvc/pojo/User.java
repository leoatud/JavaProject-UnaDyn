package com.springmvc.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
public class User {

    private Integer id;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;
    private Boolean gender;
}
