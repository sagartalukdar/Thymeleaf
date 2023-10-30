package com.tleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tleaf.entity.User;

@Controller
public class Homecontroller {

	@GetMapping("/")
	public String index(Model m) {
		m.addAttribute("obj","modelobj");
		User u1=new User(0, "dwq", "fdwe");
		User u2=new User(1, "ss", "cf");
		m.addAttribute("uobj", u2);
		m.addAttribute("b", false);
		m.addAttribute("msg", "masgh");
		m.addAttribute("mu", null);
		return "index";
	}
	@GetMapping("profile")
	public String pp(Model e) {
		User u11=new User(10, "dwq", "fdwe");
		User u22=new User(11, "ss", "cf");
		User u3=new User(12, "dwq", "fdwe");
		User u4=new User(13, "ss", "cf");
		User u5=new User(14, "dwq", "fdwe");
		User u6=new User(15, "ss", "cf");
		List<User>ul=new ArrayList<>();
		ul.add(u6);
		ul.add(u5);
		ul.add(u4);
		ul.add(u3);
		ul.add(u22);
		ul.add(u11);
		e.addAttribute("ulist", ul);
		return "profile";
	}
}
