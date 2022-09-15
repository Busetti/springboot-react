package com.guru.olympics.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.guru.olympics.model.Athlete;

@Service
public class MockAthletesService implements AtheleteService{

	private List<Athlete> athletes;

	public MockAthletesService() {
		initMockData();
	}

	private void initMockData() {
		final ObjectMapper mapper = new ObjectMapper();
		try {
			Athlete[] __athlete = mapper
					.readValue(this.getClass().getClassLoader().getResource("olympic-winners.json"),
					Athlete[].class);
			athletes = Arrays.asList(__athlete);
		} catch (StreamReadException e) {
			e.printStackTrace();
		} catch (DatabindException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Athlete> findAllWinners() {
		return athletes;
	}
}
