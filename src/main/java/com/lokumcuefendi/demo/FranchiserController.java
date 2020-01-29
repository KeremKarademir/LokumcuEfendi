package com.lokumcuefendi.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@EnableAutoConfiguration
public class FranchiserController {
	
	FranchiserDAO dao = new FranchiserDAO(new JdbcTemplate());
	
	@GetMapping(path = "save")
	public ModelAndView addFranchiser(FranchiserCandidate candidate) {
		dao.add(candidate);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("candidate",candidate);
		mv.setViewName("display");
		System.out.println("Bu iş tamam");
		return mv;
	}
	
	@RequestMapping("/")
	public String home() {
		return "franchisedemo";
	}
	
}
