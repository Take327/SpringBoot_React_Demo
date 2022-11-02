package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.AuthRequest;
import com.example.demo.entity.Auth;

/**
 * ユーザー情報 Mapper
 */
@Mapper
public interface AuthMapper {
    /**
     * ユーザー情報検索
     * @param user 検索用リクエストデータ
     * @return ユーザー情報
     */
    Auth authCheck(AuthRequest auth);
}