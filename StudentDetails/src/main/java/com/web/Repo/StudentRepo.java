package com.web.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.Entity.StudentEntity;
@Repository
public interface StudentRepo extends CrudRepository<StudentEntity, Integer> {

}
