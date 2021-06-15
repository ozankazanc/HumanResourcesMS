package kio.HumanResourcesMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kio.HumanResourcesMS.business.abstracts.JobExperienceService;
import kio.HumanResourcesMS.entities.concretes.JobExperience;

@RestController
@RequestMapping("/api/jobexperience")
public class JobExperienceController {

	private JobExperienceService jobExperienceService;

	@Autowired
	public JobExperienceController(JobExperienceService jobExperienceService) {
		super();
		this.jobExperienceService = jobExperienceService;
	}

	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody JobExperience jobExperience) {
		var result = this.jobExperienceService.add(jobExperience);
		if (!result.getSuccess()) {
			return ResponseEntity.badRequest().body(result);
		}
		return ResponseEntity.ok(result);
	}

	@GetMapping("/getall")
	public ResponseEntity<?> getAll() {
		var result = this.jobExperienceService.getAll();
		if (!result.getSuccess()) {
			return ResponseEntity.badRequest().body(result);
		}
		return ResponseEntity.ok(result);
	}

	@GetMapping("/getbycv")
	public ResponseEntity<?> getbyCurriculumVitae(int cvId) {
		var result = this.jobExperienceService.getByCurriculumVitae(cvId);
		if (!result.getSuccess()) {
			return ResponseEntity.badRequest().body(result);
		}
		return ResponseEntity.ok(result);
	}

}
