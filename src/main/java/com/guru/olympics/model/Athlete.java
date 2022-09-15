package com.guru.olympics.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Athlete {
	public String athlete;
	public int age;
	public String country;
	public int year;
	public String date;
	public String sport;
	public int gold;
	public int silver;
	public int bronze;
	public int total;
}