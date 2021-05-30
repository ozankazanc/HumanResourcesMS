package kio.HumanResourcesMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.entities.concretes.JobAdvertisement;
import kio.HumanResourcesMS.business.abstracts.JobAdvertisementService;

@RestController
@RequestMapping("/api/jobAdvertisement")
public class JobAdvertisementController {

	private JobAdvertisementService jobAdvertisementService;
	
	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService)
	{
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) 
	{
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody JobAdvertisement jobAdvertisement) 
	{
		return this.jobAdvertisementService.update(jobAdvertisement);
	}
	@GetMapping("/getAll")
	public Result getAll() 
	{
		return this.jobAdvertisementService.getAll();
	}
	@GetMapping("/getAllIsActive")
	public Result getAllSortedByActive() 
	{
		return this.jobAdvertisementService.getAllSortedByActive();
	}
	
	@GetMapping("/getByActiveOneCompany")
	public Result getByActiveOneCompany(@RequestParam String companyName) 
	{
		return this.jobAdvertisementService.getByActiveOneCompany(companyName);
	}
	
}
