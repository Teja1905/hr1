package com.slokam.test.service.impl;

import com.slokam.test.entity.Location;
import com.slokam.test.repo.LocationRepo;
import com.slokam.test.service.LocationService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class LocationServiceImpl implements LocationService {

      
   

	@Autowired
	private LocationRepo repo;
	
	@Override
	public List<Location> getAll() {
		return repo.findAll();
	}

	@Override
	public Location getById(Integer id) {
		
		Optional<Location> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Location save(Location todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Location todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
