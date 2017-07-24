package com.thesis.app.repository;

import com.thesis.app.model.ChecklistItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Created by Seppo on 30/06/2017.
 */
@Repository
public interface ChecklistRepository extends CrudRepository<ChecklistItem, Long> {

    public Set<ChecklistItem> findByProjectId(Long projectId);

    public Set<ChecklistItem> findByProjectIdAndDone(Long projectId, Boolean done);
}
