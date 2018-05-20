package com.tkbasdat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tkbasdat.model.PollingModel;
import com.tkbasdat.service.PollingService;

@Controller
public class PollingController {
	
	@Autowired
	PollingService pollingDAO;
	
	 @RequestMapping("/polling/lihat")
	    public String viewPolling(Model model)
	    {
	        List<PollingModel> polling = pollingDAO.selectAllPolling();

	        if (polling != null) {
	            model.addAttribute ("polling", polling);
	            return "view-polling";
	        } else {
	            model.addAttribute ("polling", polling);
	            return "not-found";
	        }
	    }

}
