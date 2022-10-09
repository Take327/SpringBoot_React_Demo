package com.example.demo.entity;

import lombok.Data;

/***********************************
 * 
 * ユーザー情報Entity
 *
 **********************************/

@Data
public class User {
	
	private Long id;
	private String name;
	private String address;
	private String phone;
	private String updateDate;
	private String createDate;
	private String deleteDate;
	
	
	

}
