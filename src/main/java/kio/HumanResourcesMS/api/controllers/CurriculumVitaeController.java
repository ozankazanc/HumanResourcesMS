package kio.HumanResourcesMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kio.HumanResourcesMS.business.abstracts.CurriculumVitaeService;
import kio.HumanResourcesMS.core.utilities.results.DataResult;
import kio.HumanResourcesMS.core.utilities.results.Result;
import kio.HumanResourcesMS.entities.concretes.CurriculumVitae;

@RestController
@RequestMapping("/api/cv")
public class CurriculumVitaeController {
	
private CurriculumVitaeService curriculumVitaeService;
	
	@Autowired
	public CurriculumVitaeController(CurriculumVitaeService curriculumVitaeService)
	{
		super();
		this.curriculumVitaeService = curriculumVitaeService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<CurriculumVitae>> getAll() {
		return this.curriculumVitaeService.getAll();
	}
	@GetMapping("/getallcvjobseeker")
	public DataResult<List<CurriculumVitae>> getByAllCvJobseeker(int joobsekerId) {
		return this.curriculumVitaeService.getByAllCvJobseeker(joobsekerId);
	}
	@GetMapping("/getbyidcvjobseeker")
	public DataResult<CurriculumVitae> getByIdCvJobseeker(int cvId) {
		return this.curriculumVitaeService.getByIdCvJobseeker(cvId);
	}
	@PostMapping("/add")
	public Result add(@RequestBody CurriculumVitae curriculumVitae) {
		return this.curriculumVitaeService.add(curriculumVitae);
	}
}
