package com.rms.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rms.model.Project;
import com.rms.model.User;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{
	
	

}
