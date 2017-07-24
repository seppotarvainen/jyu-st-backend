package com.thesis.app.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Seppo on 30/06/2017.
 */
@Entity
public class Project extends BaseEntity{

    public Project(){}

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private Boolean done = false;

    @Column
    private Long timeInSeconds;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Long getTimeInSeconds() {
        return timeInSeconds;
    }

    public void setTimeInSeconds(Long timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }
}
