package kio.HumanResourcesMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kio.HumanResourcesMS.business.abstracts.SystemEmployeeService;

@RestController
@RequestMapping("/api/systememployee")
@CrossOrigin
public class SystemEmployeeController {

	private SystemEmployeeService systemEmployeService;

	@Autowired
	public SystemEmployeeController(SystemEmployeeService systemEmployeService) {
		super();
		this.systemEmployeService = systemEmployeService;
	}
	
	@GetMapping("/getall")
	public ResponseEntity<?> getAll(){
		
		return ResponseEntity.ok(this.systemEmployeService.getAll());
	}
	
}
