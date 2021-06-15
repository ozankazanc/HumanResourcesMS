package kio.HumanResourcesMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kio.HumanResourcesMS.business.abstracts.LanguageInformationService;
import kio.HumanResourcesMS.entities.concretes.LanguageInformation;



@RestController
@RequestMapping("/api/languageinformation")
public class LanguageInformationController {

	private LanguageInformationService languageInformationService;

	@Autowired
	public LanguageInformationController(LanguageInformationService languageInformationService) {
		super();
		this.languageInformationService = languageInformationService;
	}

	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody LanguageInformation languageInformation) {
		var result = this.languageInformationService.add(languageInformation);
		if (!result.getSuccess()) {
			return ResponseEntity.badRequest().body(result);
		}
		return ResponseEntity.ok(result);
	}

	@GetMapping("/getall")
	public ResponseEntity<?> getAll() {
		var result = this.languageInformationService.getAll();
		if (!result.getSuccess()) {
			return ResponseEntity.badRequest().body(result);
		}
		return ResponseEntity.ok(result);
	}

	@GetMapping("/getbycv")
	public ResponseEntity<?> getbyCurriculumVitae(int cvId) {
		var result = this.languageInformationService.getByCurriculumVitae(cvId);
		if (!result.getSuccess()) {
			return ResponseEntity.badRequest().body(result);
		}
		return ResponseEntity.ok(result);
	}
}
