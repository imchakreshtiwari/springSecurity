package com.turbo.turboSenseFinal.controller;

import java.security.Principal;
import java.util.Optional;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.turbo.turboSenseFinal.entity.TestEntity;
import com.turbo.turboSenseFinal.service.TestService;

@Controller
public class TestCont {

	@Autowired
	TestService testService;

	@RequestMapping(value = "/getByid/{id}", method = RequestMethod.GET)
	public Optional<TestEntity> getOneById(@PathVariable("id") Long id) {

		return testService.getOne(id);
	}

	@RequestMapping(value = "/adddata", method = RequestMethod.POST)
	public TestEntity addData(@RequestBody TestEntity testEntity) {
		return testService.saveOne(testEntity);
	}

	
	//home page
    @GetMapping({"/", "/home"})
	public String form() {
		return "home";
	}
	//Cookies
	@GetMapping("/aaa")
	public String readCookie(@CookieValue(value="username",defaultValue = "shubham")String name) {
		return "my name is"+name;
	}
	
	//login page
	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}
	//logout page
	@RequestMapping("/logout-success")
	public String logoutPage() {
		return "logout";
	}
	//oauth2 login
	@RequestMapping("/user")
	@ResponseBody
	public Principal user(Principal principal) {
		return principal;
	}
	
	@GetMapping("/changename")
	public String setCookie(HttpServletResponse response) {
		Cookie cookie = new Cookie("username","abcd");
		response.addCookie(cookie);
		
		return "UserName Updated";
		}
	
//	@GetMapping("/")
//	public String process(Model model, HttpSession session) {
//		@SuppressWarnings("unchecked")
//		List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");
//
//		if (messages == null) {
//			messages = new ArrayList<>();
//		}
//		model.addAttribute("sessionMessages", messages);
//
//		return "index";
//	}
}
