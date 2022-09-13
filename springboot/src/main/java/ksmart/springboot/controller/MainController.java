package ksmart.springboot.controller;

import org.springframework.ui.Model;

@Controller
public class MainController {

	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("text", "HELLO SPRING BOOT")
	}
}
