package com.epam.tb.blog.model;

import java.util.Date;

public abstract class Publication extends BaseEntity {
    User author;
    String title;
    String body;
    Date created;
    int likes;
}
