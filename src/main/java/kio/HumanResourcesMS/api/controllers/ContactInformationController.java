package kio.HumanResourcesMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kio.HumanResourcesMS.business.abstracts.ContactInformationService;
import kio.HumanResourcesMS.entities.concretes.ContactInformation;

@RestController
@RequestMapping("/api/contactinformation")
public class ContactInformationController {

	private ContactInformationService contactInformationService;

	@Autowired
	public ContactInformationController(ContactInformationService contactInformationService) {
		super();
		this.contactInformationService = contactInformationService;
	}

	@GetMapping("/getall")
	public ResponseEntity<?> getAll() {
		var result = this.contactInformationService.getAll();
		if (!result.getSuccess()) {
			return ResponseEntity.badRequest().body(result);
		}
		return ResponseEntity.ok(result);
	}

	@GetMapping("/getbycv")
	public ResponseEntity<?> getbygetByCurriculumVitae(int cvId) {
		var result = this.contactInformationService.getByCurriculumVitae(cvId);
		if (!result.getSuccess()) {
			return ResponseEntity.badRequest().body(result);
		}
		return ResponseEntity.ok(result);
	}
	
	@PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody ContactInformation contactInformation){
        var result = this.contactInformationService.add(contactInformation);
        if (!result.getSuccess()){
            return ResponseEntity.badRequest().body(result);
        }
        return ResponseEntity.ok(result);
    }
	
}
