package com.turbo.turboSenseFinal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turbo.turboSenseFinal.entity.TestEntity;

@Repository
public interface TestRepo  extends JpaRepository<TestEntity, Long>{
	

}
