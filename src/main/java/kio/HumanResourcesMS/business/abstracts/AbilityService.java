package kio.HumanResourcesMS.business.abstracts;

import java.util.List;

import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.entities.concretes.Ability;

public interface AbilityService {

	Result add(Ability ability);
		
	DataResult<List<Ability>> getAll();
	DataResult<List<Ability>> getByCurriculumVitae(int cvid);
}
