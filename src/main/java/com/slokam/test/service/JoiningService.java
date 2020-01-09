package com.slokam.test.service;

import com.slokam.test.entity.Joining;
import com.slokam.test.repo.JoiningRepo;

import java.util.*;

public interface JoiningService {
	
	public List<Joining> getAll();
	public Joining getById(Integer id);
	public Joining save(Joining Joining);
	public void remove(Joining Joining);
    public void remove(Integer id);
}
