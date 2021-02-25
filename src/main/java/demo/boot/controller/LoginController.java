package demo.boot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller

@SessionAttributes("name")
public class LoginController {

@GetMapping("/login")
  public String loginHome(ModelMap model) {
		return "login"; 
	}
	@PostMapping("/welcome")
	public String welcomeHome(ModelMap model,@RequestParam("name") String name ,@RequestParam("passwd") String passwd ,HttpServletRequest request) {
		if(name.equals("cdac") && passwd.equals("cdac")) {
		model.addAttribute("name" , name);
		return "welcome";
		}else {
			model.addAttribute("msg" , "invalid credentails");

			return "login"; 	
		}
		
	}
	

}
