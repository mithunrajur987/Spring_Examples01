package com.cluster;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
@Controller
public class MyController {
	
	@RequestMapping(value="/welcome")
	public String m1(Model mod)
	{
		mod.addAttribute("msg", "Greetings for the day");
		return "home";
	}

}
