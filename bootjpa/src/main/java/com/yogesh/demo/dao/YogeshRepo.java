package com.yogesh.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.yogesh.demo.modal.Yogesh;

public interface YogeshRepo extends CrudRepository <Yogesh,Integer > 
{
	List<Yogesh> findByTech(String tech);
	List<Yogesh> findByAidGreaterThan(int aid);
	@Query ("from Yogesh where tech=?1 order by name")
      List<Yogesh> findByTechSorted(String tech);
	
}
