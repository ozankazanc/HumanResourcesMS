package kio.HumanResourcesMS.business.abstracts;

import java.util.List;


import kio.HumanResourcesMS.entities.concretes.*;
import kio.HumanResourcesMS.core.utilities.results.*;


public interface CurriculumVitaeService {

	Result add(CurriculumVitae curriculumVitae);
	Result update(CurriculumVitae curriculumVitae);
	
	DataResult<List<CurriculumVitae>>  getAll();
	DataResult<List<CurriculumVitae>> getByAllCvJobseeker(int joobseekerId);
	DataResult<CurriculumVitae> getByIdCvJobseeker(int cvId);
	
}
