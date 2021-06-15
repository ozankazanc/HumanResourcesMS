package kio.HumanResourcesMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kio.HumanResourcesMS.business.abstracts.EducationInformationService;
import kio.HumanResourcesMS.entities.concretes.EducationInformation;

@RestController
@RequestMapping("/api/educationinformation")
public class EducationInformationController {

	private EducationInformationService educationInformationService;

	@Autowired
	public EducationInformationController(EducationInformationService educationInformationService) {
		super();
		this.educationInformationService = educationInformationService;
	}

	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody EducationInformation educationInformation) {
		var result = this.educationInformationService.add(educationInformation);
		if (!result.getSuccess()) {
			return ResponseEntity.badRequest().body(result);
		}
		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<?> getAll() {
		var result = this.educationInformationService.getAll();
		if (!result.getSuccess()) {
			return ResponseEntity.badRequest().body(result);
		}
		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/getbycv")
	public ResponseEntity<?> getbyCurriculumVitae(int cvId) {
		var result = this.educationInformationService.getByCurriculumVitae(cvId);
		if (!result.getSuccess()) {
			return ResponseEntity.badRequest().body(result);
		}
		return ResponseEntity.ok(result);
	}
	
	
}
