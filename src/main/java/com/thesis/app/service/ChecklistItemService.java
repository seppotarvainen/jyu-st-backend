package com.thesis.app.service;

import com.thesis.app.model.ChecklistItem;
import com.thesis.app.model.Project;
import com.thesis.app.repository.ChecklistRepository;
import com.thesis.app.repository.ProjectRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Seppo on 30/06/2017.
 */
@Service
public class ChecklistItemService {

    @Autowired
    private ProjectRespository projectRespository;

    @Autowired
    private ChecklistRepository checklistItemRepository;

    public ChecklistItem saveChecklistItem(Long projectId, ChecklistItem checklistItem){

        // TODO: error handling

        Project project = projectRespository.findOne(projectId);
        checklistItem.setProject(project);
        return checklistItemRepository.save(checklistItem);
    }

    public void deleteCompletedChecklistItems(Long projectId) {
        Set<ChecklistItem> items = checklistItemRepository.findByProjectIdAndDone(projectId, true);
        checklistItemRepository.delete(items);
    }
}
