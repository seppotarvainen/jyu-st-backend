package com.thesis.app.controller;

import com.thesis.app.dto.ProjectDto;
import com.thesis.app.model.ChecklistItem;
import com.thesis.app.model.Project;
import com.thesis.app.model.TextResponse;
import com.thesis.app.repository.ChecklistRepository;
import com.thesis.app.repository.ProjectRespository;
import com.thesis.app.service.ChecklistItemService;
import com.thesis.app.service.ProjectService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Seppo on 30/06/2017.
 */
@CrossOrigin
@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private ChecklistItemService checklistItemService;

    private static ModelMapper modelMapper = new ModelMapper();

//    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
//    public ResponseEntity<TextResponse> getSimpleMessage(){
//        return ResponseEntity.ok(new TextResponse("hei"));
//    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ProjectDto> createProject(@RequestBody Project project) {
        return ResponseEntity.ok(projectService.saveProject(project));
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Set<ProjectDto>> getProjects(){
        return ResponseEntity.ok(projectService.getAllProjects());
    }

    @RequestMapping(path = "/{projectId}", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity<ProjectDto> editProject(@PathVariable Long projectId, @RequestBody Project project){

        // TODO: Check if ids match

        return ResponseEntity.ok(projectService.saveProject(project));
    }

    @RequestMapping(path = "{projectId}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity deleteProject(@PathVariable Long projectId){

        projectService.deleteProject(projectId);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }

    @RequestMapping(path = "/{projectId}/checklist-items", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ChecklistItem> createProjectChecklistItem(@PathVariable Long projectId, @RequestBody ChecklistItem checklistItem){
        return ResponseEntity.ok(checklistItemService.saveChecklistItem(projectId, checklistItem));
    }

    @RequestMapping(path = "/{projectId}/checklist-items", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<TextResponse> deleteProjectCompletedChecklistItems(@PathVariable Long projectId){

        checklistItemService.deleteCompletedChecklistItems(projectId);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new TextResponse("Delete successful"));
    }

    @RequestMapping(path = "/{projectId}/checklist-items/{checklistItemId}", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity<ChecklistItem> updateProjectChecklistItem(@PathVariable Long projectId, @PathVariable Long checklistItemId, @RequestBody ChecklistItem checklistItem){
        // TODO: Check if ids match

        return ResponseEntity.ok(checklistItemService.saveChecklistItem(projectId, checklistItem));
    }

}
