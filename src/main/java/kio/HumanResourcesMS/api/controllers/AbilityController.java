package kio.HumanResourcesMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kio.HumanResourcesMS.business.abstracts.AbilityService;
import kio.HumanResourcesMS.core.utilities.results.DataResult;
import kio.HumanResourcesMS.core.utilities.results.Result;
import kio.HumanResourcesMS.entities.concretes.Ability;

@RestController
@RequestMapping("/api/ability")
public class AbilityController {

	private AbilityService abilityService;
	
	@Autowired
	public AbilityController(AbilityService abilityService)
	{
		super();
		this.abilityService = abilityService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Ability>> getAll() {
		return this.abilityService.getAll();
	}
	@GetMapping("/getbycv")
	public DataResult<List<Ability>> getbygetByCurriculumVitae(int cvid) {
		return this.abilityService.getByCurriculumVitae(cvid);
	}
	@PostMapping("/add")
	public Result add(@RequestBody Ability ability) {
		return this.abilityService.add(ability);
	}
}
