package com.epam.tb.blog.model;

import java.util.Date;
import java.util.List;

class Blog extends BaseEntity {
    String title;
    String description;
    User author;
    List<Post> posts;
    Date creationDate;
    List<Tag> tags;
}
