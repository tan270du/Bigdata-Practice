package com.taotao.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 注册和登录页面
 * @author Administrator
 *
 */
@Controller
public class PageController {

	/**
	 * 展示登录页面
	 */
	@RequestMapping("/page/login")
	public String showLogin(String redirectURL, Model model) {
		// 需要把参数传递给 jsp
		model.addAttribute("redirect", redirectURL);
		return "login";
	}
	/**
	 * 展示注册页面
	 */
	@RequestMapping("/page/register")
	public String showRegister() {
		return "register";
	}
}
