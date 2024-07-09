package com.weilai.jpa.repository;

import com.weilai.jpa.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
* 使用JPA完成增删改查
* JpaRepository<T, ID>:
* T:表示实体类
* ID: 操作的实体类对应的主键的数据类型, 和实体类的@Id属性修饰的类型一致。
* */

public interface UserRepository extends JpaRepository<User, Integer> {
    User findOneById(Integer id);
}
