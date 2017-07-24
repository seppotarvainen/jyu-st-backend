package com.thesis.app.repository;

import com.thesis.app.model.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Seppo on 30/06/2017.
 */
@Repository
public interface ProjectRespository extends CrudRepository<Project, Long> {

}
