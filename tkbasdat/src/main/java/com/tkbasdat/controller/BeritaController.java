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
	@RequestMapping("/berita/detail")
	public String detailBerita(Model model) {
		model.addAttribute("title","Best practices for developing iOS application with Tensorflow integration by the Google AI team.");
		return "viewBerita";
	}
	@RequestMapping("/berita/rating")
	public String ratingBerita(Model model) {
		model.addAttribute("title","Rate the News!");
		return "rating";
	}
	@RequestMapping("/berita/comment")
	public String commentBerita(Model model) {
		model.addAttribute("title","Give comment!");
		return "comment";
	}
}
