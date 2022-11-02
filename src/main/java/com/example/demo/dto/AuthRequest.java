package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * ユーザー情報 検索用リクエストデータ
 */
@Data
public class AuthRequest implements Serializable {

  /**
   * ユーザーID
   */
  private String id;
  private String pass;
}