package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.electronic.Electronics;



public interface ElectronicRepository extends JpaRepository<Electronics, Integer> {

}

