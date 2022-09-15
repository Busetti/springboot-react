package com.guru.olympics.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guru.olympics.model.Athlete;
import com.guru.olympics.service.AtheleteService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AthleteController {
	
	
	@Autowired
	private AtheleteService athleteService;
	
	
	@GetMapping("/winners")
	public ResponseEntity<List<Athlete>> getAllOlympicWinners(){
		return ResponseEntity.ok().body(athleteService.findAllWinners());
	}

}
