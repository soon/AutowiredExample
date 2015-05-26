package com.springapp.mvc;

import com.springapp.mvc.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class CityController {
	@Autowired
    CityService cityService;

	@RequestMapping(method = RequestMethod.GET)
	public String listCities(ModelMap model) {
		model.addAttribute("cities", cityService.getAll());
		return "list_of_cities";
	}
}