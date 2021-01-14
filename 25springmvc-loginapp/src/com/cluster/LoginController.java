package com.cluster;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
@Controller
public class LoginController {
	
	@RequestMapping(value="/login")
	public ModelAndView display()
	{
		UserTO uo = new UserTO();
		return new ModelAndView("enter", "uto", uo );
	}
	
	@RequestMapping(value="/check")
	public String checkuser(UserTO user)
	{
		if (user.getName().equals("ravi") && user.getPassword().equals("cluster")) 
		{
			return "success";
		}
		
		else
		{
			return "failure";
		}
	}
}
