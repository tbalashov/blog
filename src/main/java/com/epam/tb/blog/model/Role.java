package com.epam.tb.blog.model;

public class Role {
    public static final Role ADMIN = new Role("admin");
    public static final Role AUTHOR = new Role("author");
    public static final Role GUEST = new Role("guest");
    String title;

    public Role(String title) {
        this.title = title;
    }
}
