package com.young.music.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author yzx
 * create_time 2020/5/12
 */
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void insert() {
        String sql = "INSERT INTO `classes`(id,name) VALUES (?, ?)";
        int update = jdbcTemplate.update(sql, "333", "x班");
        System.out.println(1 / 0);
        System.out.println(update);
    }
}
