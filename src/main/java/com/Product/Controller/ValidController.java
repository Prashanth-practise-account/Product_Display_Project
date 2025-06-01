package com.Product.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Product.Entity.Admin;
import com.Product.Repository.AdminRepo;

@Controller
public class ValidController {
	@Autowired
	AdminRepo repo;
	@GetMapping("/app")
	public String validPage(Model model)
	{
		return "Validation";
	}
		@PostMapping("/login")
		String validate(@ModelAttribute Admin admin,Model model)
		{
			Admin a = repo.findById(1).orElse(null);
			if(admin.getName().equals(a.getName())&&admin.getPass().equals(a.getPass())){
					return "redirect:/all";
			}
			model.addAttribute("message","Invalid user name and password");
			return "Validation";
		}
}
