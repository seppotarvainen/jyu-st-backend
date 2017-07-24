package com.thesis.app.service;

import com.thesis.app.dto.ProjectDto;
import com.thesis.app.model.ChecklistItem;
import com.thesis.app.model.Project;
import com.thesis.app.repository.ChecklistRepository;
import com.thesis.app.repository.ProjectRespository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Seppo on 30/06/2017.
 */
@Service
public class ProjectService {

    @Autowired
    private ProjectRespository projectRespository;

    @Autowired
    private ChecklistRepository checklistItemRepository;

    private static ModelMapper modelMapper = new ModelMapper();

    public ProjectDto saveProject(Project project) {
        Project editedProject = projectRespository.save(project);

        ProjectDto returnValue = modelMapper.map(editedProject, ProjectDto.class);
        Set<ChecklistItem> checklistItems = checklistItemRepository.findByProjectId(editedProject.getId());

        returnValue.setChecklist(checklistItems);

        return returnValue;
    }

    public Set<ProjectDto> getAllProjects(){
        Set<ProjectDto> projects = new HashSet<>();

        projectRespository.findAll().forEach(project -> {
            Set<ChecklistItem> checklistItems = checklistItemRepository.findByProjectId(project.getId());
            ProjectDto newProject = modelMapper.map(project, ProjectDto.class);
            newProject.setChecklist(checklistItems);
            projects.add(newProject);
        });

        return projects;
    }

    public void deleteProject(Long id) {
        Set<ChecklistItem> checklistItems = checklistItemRepository.findByProjectId(id);
        checklistItemRepository.delete(checklistItems);

        projectRespository.delete(id);
    }
}
