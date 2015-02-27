package com.epam.tb.blog;

import com.epam.tb.blog.model.User;

import java.util.Date;

public class Runner {

    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("Vasya");
        user.setBirthday(new Date());
        User user2 = user.clone();
        user2.setBirthday(new Date(0));
        System.out.println(user);
        System.out.println(user2);
    }
}
