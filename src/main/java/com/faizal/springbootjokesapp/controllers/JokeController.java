package com.faizal.springbootjokesapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.faizal.springbootjokesapp.services.JokeService;

@Controller
public class JokeController {

	@Autowired
	private JokeService jokeService;

	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}

	@RequestMapping({ "/", "" })
	public String showJoke(Model model) {
		
		model.addAttribute("joke", jokeService.getJoke());
		
		return "chucknorris";
	}
}
