package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.dto.AuthRequest;
import com.example.demo.entity.Auth;
import com.example.demo.entity.Session;
import com.example.demo.service.AuthService;

/**
 * ユーザー情報 Controller
 */
@RestController
@SessionAttributes(types = Session.class)
public class AuthController {
	/**
	 * ユーザー情報 Service
	 */
	@Autowired
	AuthService authService;

	@Autowired
	HttpSession session;

	/**
	 * ユーザー情報検索
	 * 
	 * @param userSearchRequest リクエストデータ
	 * @param model             Model
	 * @return ユーザー情報一覧画面
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Auth search(@ModelAttribute AuthRequest authRequest, HttpServletRequest request) {
		Auth auth = authService.authCheck(authRequest);

		String sha1 = DigestUtils.sha1Hex(authRequest.getPass());

		int count = 0;

		if (!sha1.equals(auth.getPass())) {
			System.out.println("password不一致");
			session.invalidate();
			return auth;
		}

		// セッション取得
		session = request.getSession(true);
		System.out.println(session.getId());

		if (session.getAttribute("auth") == null) {
			System.out.println("初回のログイン");
			session.setAttribute("auth", auth.getId());
			session.setAttribute("count", "1");
		} else {
			System.out.println("2回目以降のログイン");
			System.out.println("auth:" + ((String) session.getAttribute("auth")));
			System.out.println("count:" + ((String) session.getAttribute("count")));
		}

		return auth;
	}
}