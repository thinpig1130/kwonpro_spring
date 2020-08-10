package com.kwonpro.www;

import javax.servlet.http.HttpSession;


import org.springframework.ui.Model;

public class SessionFunc {
	
	public static void sessionControl( Model model, HttpSession session) {
		if ( session.getAttribute("uid") != null) {
			model.addAttribute("uid", session.getAttribute("uid"));
		}
	}
}
