package com.shop.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginAction {
	
	@RequestMapping("/goLogin")
	public String goLogin(@RequestParam String yu,Model model,HttpServletRequest request, HttpServletResponse response){
		System.out.println(yu);
		System.out.println(request.getParameter("yu"));
		model.addAttribute("a", "DSF");
		return "home";
	}
}
