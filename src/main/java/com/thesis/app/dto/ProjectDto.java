package com.thesis.app.dto;

import com.thesis.app.model.ChecklistItem;

import java.util.Set;

/**
 * Created by Seppo on 30/06/2017.
 */
public class ProjectDto {

    private Long id;

    private String title;

    private String description;

    private Boolean done;

    private Long timeInSeconds;

    private Set<ChecklistItem> checklist;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Set<ChecklistItem> getChecklist() {
        return checklist;
    }

    public void setChecklist(Set<ChecklistItem> checklist) {
        this.checklist = checklist;
    }
}
