package com.codesolt.springbootreactive.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Coins {
	
	@JsonProperty("success")
	private String success;
	
	@JsonProperty("payload")
	private List<Coin> payload;
}