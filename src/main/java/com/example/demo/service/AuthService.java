package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AuthRequest;
import com.example.demo.entity.Auth;
import com.example.demo.repository.AuthMapper;

/**
 * ユーザー情報 Service
 */
@Service
public class AuthService {
	/**
	 * ユーザー情報 Mapper
	 */
	@Autowired
	private AuthMapper authMapper;

	/**
	 * ユーザー情報検索 @param userSearchRequest リクエストデータ
	 * 
	 * @return 検索結果
	 */
	public Auth authCheck(AuthRequest authRequest) {
		return authMapper.authCheck(authRequest);
	}
}