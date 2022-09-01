package com.example.demo.Service;
import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.electronic.Electronics;
import com.example.demo.repository.ElectronicRepository;




@Service
public class ElectronicService {

		@Autowired
		public ElectronicRepository electronicRepo;

	public List<Electronics> getAllelectronics() {
		// TODO Auto-generated method stub
		List<Electronics> electronics =new ArrayList<>();
		electronicRepo.findAll().forEach(electronics::add);
		return electronics;
	}

	public Electronics getelectronic(Integer id) {
		// TODO Auto-generated method stub
	   try
	   {
		return electronicRepo.findById(id).get();
	   }
	   catch(Exception e)
	   {
	  	 return null;
	   }
	}

	public void addelectronic(Electronics electronic) {
		electronicRepo.save(electronic);
		// TODO Auto-generated method stub
		
	}

	public void updateelectronic(Integer id, Electronics electronic) {
		// TODO Auto-generated method stub
		electronicRepo.save(electronic);
		}

	public void deleteelectronic(Integer id) {
		// TODO Auto-generated method stub
		electronicRepo.deleteById(id);
		}
	}



