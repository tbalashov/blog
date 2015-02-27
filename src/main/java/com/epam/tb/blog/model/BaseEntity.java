package com.epam.tb.blog.model;

import java.util.UUID;

public abstract class BaseEntity {
    Integer id;
    UUID uuid;
    boolean deleted;

    public boolean isDeleted() {
        return deleted;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object obj) {
        User other = (User) obj;
        return uuid.equals(other.uuid);
    }

    public BaseEntity() {
        uuid = UUID.randomUUID();
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
