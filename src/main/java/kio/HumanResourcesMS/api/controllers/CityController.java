package kio.HumanResourcesMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kio.HumanResourcesMS.business.abstracts.CityService;
import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.entities.concretes.City;


@RestController
@RequestMapping("/api/city")
public class CityController {

	private CityService cityService;
	
	@Autowired
	public CityController(CityService cityService)
	{
		super();
		this.cityService = cityService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<City>> getAll() {
		return this.cityService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody City city) {
		return this.cityService.add(city);
	}
}
