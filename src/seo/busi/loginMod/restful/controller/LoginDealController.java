package seo.busi.loginMod.restful.controller;

import org.apache.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginDealController {
	private static final Logger log = Logger.getLogger(LoginDealController.class);
	
	@RequestMapping(value="/loginDeal",method=RequestMethod.POST)
	public void login(@RequestParam("userId") String userId,Model model){
		log.info("controller userId="+userId);
	}
}
