package com.turbo.turboSenseFinal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turbo.turboSenseFinal.entity.Username;

@Repository
public interface Usernamerepo extends JpaRepository<Username, Long>{
	
	public Username findByName(String name);

}
