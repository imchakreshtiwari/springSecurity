package com.turbo.turboSenseFinal.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turbo.turboSenseFinal.entity.TestEntity;
import com.turbo.turboSenseFinal.repo.TestRepo;

@Service
public class TestService {
	
	@Autowired
	TestRepo testRepo;
	
	public TestService(TestRepo testRepo) {
		this.testRepo = testRepo;
	}

	public Optional<TestEntity> getOne(Long id) {
		
		return testRepo.findById(id);
		
	}
	
	public TestEntity saveOne(TestEntity testEntity) {
		return testRepo.save(testEntity);
	}
}
