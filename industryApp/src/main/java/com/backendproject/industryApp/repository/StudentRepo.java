package com.backendproject.industryApp.repository;

import com.backendproject.industryApp.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Students,Integer> {
}
