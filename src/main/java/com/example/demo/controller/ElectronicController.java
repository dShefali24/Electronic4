package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.UserNotFoundException;
import com.example.demo.Service.ElectronicService;
import com.example.demo.electronic.Electronics;


@RestController
public class ElectronicController {
	@Autowired
	private ElectronicService electronicservice;
	@RequestMapping("/electronics")
	public List<Electronics> getAllelectronics()
	{
		List<Electronics> electronic = electronicservice.getAllelectronics();
		
		if(electronic.size() <= 0)
			throw new UserNotFoundException("electronics device are not available, please update first.");
			
	  return electronic;
	}
	@GetMapping("/electronics/{id}")
	public Electronics getelectronic(@PathVariable Integer id)
	{
		Electronics electronic = electronicservice.getelectronic(id);
		
		if(electronic ==  null)
			throw new UserNotFoundException("electronics device ID are not present");
			
	  return electronic;
	}
	@RequestMapping(method =RequestMethod.POST , value="/electronics" )
	public void addelectronic(@RequestBody Electronics electronic)
	{
		electronicservice.addelectronic(electronic);
	}
	@RequestMapping(method =RequestMethod.PUT , value="/electronics/{id}" )
	public void updateelectronic(@PathVariable Integer id ,@RequestBody Electronics electronic)
	{
		electronicservice.updateelectronic(id,electronic);
	}
	@RequestMapping(method =RequestMethod.DELETE , value="/electronics/{id}" )
	public void Deleteelectronic(@PathVariable Integer id)
	{
		electronicservice.deleteelectronic(id);
	}
}

