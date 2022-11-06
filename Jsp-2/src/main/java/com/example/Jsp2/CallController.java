package com.example.Jsp2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Dao.Employees;
import repo.EmpRepository;

@Controller
public class CallController {
	@Autowired
	static EmpRepository repo;
	Employees ee;
	
	@RequestMapping("call")
	public String call(Employees e) {
		
		System.out.println("done");
		
		System.out.println(e.getId());
		System.out.println(e.getName());
		this.ee=e;
		/*
		 * e.setId("k"); e.setName("Kushal");
		 */ //repo.save(e);
		return "call.jsp";
	}
	@RequestMapping("call/done")
	public String C() {
		
		System.out.println(ee.getId());
		System.out.println(ee.getName());
		repo.save(ee);
		return "call.jsp";
		
	}
	
	
	
}

	