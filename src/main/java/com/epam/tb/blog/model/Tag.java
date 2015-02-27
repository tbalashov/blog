package com.epam.tb.blog.model;

public class Tag extends BaseEntity {
    Blog blog;
//    List<Post> posts;
    int postsCount;
    String title;
}
