package com.cognizant.ormlearn.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.SkillRepository;
import com.cognizant.ormlearn.model.Skill;

@Service
public class SkillService {

	@Autowired
	SkillRepository skillRepository;
	
	@Transactional
	public Skill get(Integer id)
	{
		return skillRepository.findById(id).get();
	}
	
	@Transactional
	public void save(Skill skill)
	{
		skillRepository.save(skill);
	}
}
