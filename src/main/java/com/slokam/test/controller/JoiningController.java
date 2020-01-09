package com.slokam.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.test.entity.Joining;
import com.slokam.test.service.JoiningService;

@RestController
@RequestMapping("Joining") 
public class JoiningController {
	 @Autowired
	 private JoiningService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Joining>	 saveJoining(@RequestBody Joining obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Joining>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Joining>	 deleteJoining(@RequestBody Joining obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Joining>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Joining>> getAllJoining(){
		 List<Joining> list = service.getAll();
		 return new ResponseEntity<List<Joining>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/id")
	 public ResponseEntity<Joining> getByIdJoining(Integer id) {
		  Joining obj =  service.getById(id);
		  return new ResponseEntity<Joining>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/delete/{id}") 
	 public ResponseEntity<Joining>	 
	 deleteJoining(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Joining>(HttpStatus.OK);
	 }
}

