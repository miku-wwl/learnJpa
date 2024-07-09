package com.weilai.jpa.pojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;


@Entity(name = "t_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

//    @Column(name ="uid")
    private Long uid;

    private String password;

    private Long balance;


    private String createDate;


    private String createTime;

    private String modifyDate;

    private String modifyTime;

}