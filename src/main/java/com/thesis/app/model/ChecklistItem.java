package com.thesis.app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Created by Seppo on 30/06/2017.
 */
@Entity
public class ChecklistItem extends BaseEntity {

    @Column
    private String content;

    @Column
    private Boolean done = false;

    @JsonIgnore
    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY)
    private Project project;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
