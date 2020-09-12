package com.yogesh.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.yogesh.demo.dao.YogeshRepo;
import com.yogesh.demo.modal.Yogesh;

@RestController
public class HomeController 
{
	
	@Autowired
	YogeshRepo Repo ;
/*@RequestMapping("/")
public String home()
{
	return "home.jsp";
	}
@RequestMapping("/addYogesh")
public String addYogesh(Yogesh yogesh)
{
	Repo.save(yogesh);
	return "home.jsp";
}
@RequestMapping("/getYogesh")
public ModelAndView getYogesh(@RequestParam int aid)
{
	ModelAndView mv=new ModelAndView("show.jsp");
	
			Yogesh yogesh= Repo.findById(aid).orElse(null);
			System.out.println(Repo.findByTech("java"));
			System.out.println(Repo.findByAidGreaterThan(102));
			System.out.println(Repo.findByTechSorted("java"));
mv.addObject(yogesh);
	return mv;
}

@RequestMapping("/deletYogesh")
public ModelAndView deletYogesh(@RequestParam int aid)
{
	ModelAndView mv=new ModelAndView("home.jsp");
	
			Yogesh yogesh= Repo.findById(aid).orElse(null);
			Repo.deleteById(aid);
mv.addObject(yogesh);
	return mv;
}
@ResponseBody 
@RequestMapping("/findallYogesh")
public String findallYogesh()
{
	
	return Repo.findAll().toString();
}
	@ResponseBody
	@RequestMapping("/findByTechYogesh")
	public String findByTechYogesh(@RequestParam String aid)
	{
		
		return Repo.findByTech(aid).toString();
		
}
	@ResponseBody
	@RequestMapping("/findByTechSortedYogesh")
	public String findByTechSortedYogesh(@RequestParam String aid)
	{
		
		return Repo.findByTechSorted(aid).toString();
		}
	@ResponseBody
	@RequestMapping("/findByAidGreaterThenYogesh")
	public String findByAidGreaterThenYogesh(@RequestParam int aid)
	{
		
		return Repo.findByAidGreaterThan(aid).toString();
		}
	
	@ResponseBody
	@RequestMapping(path="/yogesh", produces={"application/xml"})
	public List<Yogesh> Yogesh()
	{
		
		return (List<Yogesh>) Repo.findAll();
		}*/
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
		}
		@GetMapping(path="/yogesh", produces={"application/json"})
		public List<Yogesh> getYogesh()
		{
			
			return (List<Yogesh>) Repo.findAll();
			}
		@PostMapping("/yogesh")
		public Yogesh addYogesh(@RequestBody Yogesh yogesh)
		{
			Repo.save(yogesh);
			return yogesh;
		}
	
		@PutMapping(path="/yogesh", produces={"application/json"})
		public Yogesh saveorupdateYogesh(@RequestBody Yogesh yogesh)
		{
			Repo.save(yogesh);
			return yogesh;
		}

		@DeleteMapping("/yogesh/{aid}")
		public String deleteYogesh(@PathVariable int aid)
		{
			Repo.deleteById(aid);
			return "Deleted";
		}

		@RequestMapping("/yogesh/{aid}")
		public Optional<Yogesh> Yogesh(@PathVariable int aid)
		{
			return Repo.findById(aid);
		
		
		}
}


