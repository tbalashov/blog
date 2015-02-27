package com.epam.tb.blog.model;

import java.util.List;

public class Post extends Publication {
    private Blog blog;
    private int views;
    private List<Comment> comments;
    private List<Tag> tags;

}
