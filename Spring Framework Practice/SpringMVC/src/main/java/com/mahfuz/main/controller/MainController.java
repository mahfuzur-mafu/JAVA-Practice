package com.mahfuz.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mahfuz.main.model.Programmer;
import com.mahfuz.main.repository.ProgrammerRepo;

@Controller
@ControllerAdvice
public class MainController {

	@Autowired
	ProgrammerRepo pr;

//	@ModelAttribute
//	public void welcome(Model m) {
//		m.addAttribute("msg", "Welcome");
//	}

//	@RequestMapping("/home")
	
	
	@GetMapping("/home")
	public String homepage() {
		return "HomePage.html";
	}

	@PostMapping("/addprogrammer")
//	@RequestMapping(value ="/addprogrammer",method=RequestMethod.POST)
	public String addprogrammer(@ModelAttribute Programmer programmer) {
		pr.save(programmer);

		return "redirect:/home";

//	public ModelAndView addprogrammer(@RequestParam ("pid")int   i,@RequestParam ("pname") String n,@RequestParam ("plang")  String l, ModelMap model) {
//		//System.out.println(pid+" " +pname+" " +plang );

//		ModelAndView mv =new ModelAndView();
//		mv.setViewName("ProgrammerInfo.html");

//		mv.addObject("pname",n);
//		mv.addObject("pid",i);
//		mv.addObject("plang",l);

//		
//		model.addAttribute("pname",pname);
//		model.addAttribute("pid",i);
//		model.addAttribute("plang",plang);

	}
	
	@PostMapping("/findbyId")
   public String findbyId(@RequestParam int pid , Model m)
   {
		Programmer p =pr.getOne(pid);
		m.addAttribute("programmer",p);
		return "ProgrammerInfo.html";
		
   }
	
	
	@PostMapping("/findbyLang")
	   public String findbyLang(@RequestParam String plang , Model m)
	   {
			List <Programmer> p =pr.findByplang(plang);
			m.addAttribute("programmers",p);
			return "AllProgrammer .html";
			
	   }
	
	@PostMapping("/updateProgrammer")
	   public String updateProgrammer(@ModelAttribute Programmer programmer)
	   {
			Programmer p =pr.getOne(programmer.getPid());
		    p.setPname(programmer.getPname());
		    p.setPlang(programmer.getPlang());
		    pr.save(p);
			return "ProgrammerInfo.html";
			
	   }
	
	
	
	@GetMapping("/deleteProgrammer")
	public String deleteProgrammer(@RequestParam int pid )
	{
		pr.deleteById(pid);
		return "redirect:/home";
	}
	
//	@GetMapping("/allprogrammer")
//	public String allProgrammer(Model m) {
//		List<Programmer> p = new ArrayList<Programmer>();
//		p.add(new Programmer(101, "Mahfuzur", "Java"));
//		p.add(new Programmer(103, "Mahfuzur", "c"));
//		p.add(new Programmer(103, "Mahfuzur", "cpp"));
//
//		m.addAttribute("programmers", p);
//
//		return "AllProgrammer.html";
//
//	}

}
