package com.tkbasdat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tkbasdat.model.BeritaModel;
import com.tkbasdat.model.KomentarModel;
import com.tkbasdat.service.BeritaService;
import com.tkbasdat.service.KomentarService;

@Controller
public class BeritaController {
	
	@Autowired
	BeritaService beritaDAO;
	
	@Autowired
    KomentarService komentarDAO;
	
	@RequestMapping("/berita")
	public String berita(Model model) {
		
		List<BeritaModel> berita= beritaDAO.selectAllBerita();
		model.addAttribute("berita",berita);
		return "viewAllBerita";
	}
	
	@RequestMapping("/berita/detail/{url}")
    public String viewPath (Model model,
            @PathVariable(value = "url") String url)
    {
        BeritaModel berita = beritaDAO.selectBerita(url);

        if (berita != null) {
        		List<KomentarModel> komentars = komentarDAO.selectAllKomentarByUrl(berita.getUrl());
            model.addAttribute ("berita", berita);
            model.addAttribute("komentars",komentars);
            model.addAttribute("title",berita.getJudul());
            return "viewBerita";
        } else {
            model.addAttribute ("berita", berita);
            return "not-found";
        }
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
