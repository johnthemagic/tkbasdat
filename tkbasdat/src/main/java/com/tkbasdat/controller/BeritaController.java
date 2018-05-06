package com.tkbasdat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BeritaController {
	@RequestMapping("/berita")
	public String berita(Model model) {
		model.addAttribute("title","All Berita");
		return "viewAllBerita";
	}
	@RequestMapping("/berita/rating")
	public String ratingBerita(Model model) {
		model.addAttribute("title","Rate the News!");
		return "rating";
	}
	@RequestMapping("/berita/comment")
	public String commentBerita(Model model) {
		model.addAttribute("title","Comment the News!");
		return "comment";
	}
}
