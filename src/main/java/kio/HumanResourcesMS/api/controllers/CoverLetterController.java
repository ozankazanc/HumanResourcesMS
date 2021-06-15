package kio.HumanResourcesMS.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kio.HumanResourcesMS.business.abstracts.CoverLetterService;
import kio.HumanResourcesMS.entities.concretes.CoverLetter;

@RestController
@RequestMapping("/api/coverletter")
public class CoverLetterController {

	private CoverLetterService coverLetterService;

	public CoverLetterController(CoverLetterService coverLetterService) {
		this.coverLetterService = coverLetterService;
	}

	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody CoverLetter coverLetter) {
		var result = this.coverLetterService.add(coverLetter);
		if (!result.getSuccess()) {
			return ResponseEntity.badRequest().body(result);
		}
		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<?> getAll(){
		var result = this.coverLetterService.getAll();
		if (!result.getSuccess()) {
			return ResponseEntity.badRequest().body(result);
		}
		return ResponseEntity.ok(result);
	}
	@GetMapping("/getbycv")
	public ResponseEntity<?> getByCurriculumVitae(int cvId){
		var result = this.coverLetterService.getbyCurriculumVitae(cvId);
		if (!result.getSuccess()) {
			return ResponseEntity.badRequest().body(result);
		}
		return ResponseEntity.ok(result);
	}
	

}
