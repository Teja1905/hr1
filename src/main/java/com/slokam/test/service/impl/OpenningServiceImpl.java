package com.slokam.test.service.impl;

import com.slokam.test.entity.Openning;
import com.slokam.test.repo.OpenningRepo;
import com.slokam.test.service.OpenningService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class OpenningServiceImpl implements OpenningService {

      
   

	@Autowired
	private OpenningRepo repo;
	
	@Override
	public List<Openning> getAll() {
		return repo.findAll();
	}

	@Override
	public Openning getById(Integer id) {
		
		Optional<Openning> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Openning save(Openning todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Openning todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
