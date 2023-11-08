package com.xworkz.sweets;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestModel {
	
	public RequestModel() {
		System.out.println("RequestModel executed");
	}
	@RequestMapping(value = {"/get"},method=RequestMethod.GET)
	public String get() {
		return "index.jsp";
		

	}
	@RequestMapping(value= {"/getData"},method=RequestMethod.GET)
	public String getData(Model model)
	{
		model.addAttribute("Message","Sweets are delicious");
		return "index.jsp";
	}
	@RequestMapping(value= {"/send"},method=RequestMethod.POST)
	public String sendSweets(@RequestParam String sweetName,@RequestParam int price,Model model)
	{
		System.out.println("Method working");
		System.out.println("Sweet name "+sweetName);
		System.out.println("Price "+price);
		if(sweetName!=null && !sweetName.isEmpty())
		{
			if(price>50)
			{
				model.addAttribute("valid","Sweet is valid");
				return "index";
			}
		}
		model.addAttribute("valid","Sweet is not valid");
		return "index";
	}
	

}
