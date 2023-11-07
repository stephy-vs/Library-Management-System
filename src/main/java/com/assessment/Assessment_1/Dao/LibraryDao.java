package com.assessment.Assessment_1.Dao;

import com.assessment.Assessment_1.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryDao extends JpaRepository<Library,Integer> {
}
