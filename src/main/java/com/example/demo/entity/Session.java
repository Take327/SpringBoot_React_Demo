package com.example.demo.entity;

import lombok.Data;

@Data
public class Session {

	private boolean state;
	private int count = 0;

}