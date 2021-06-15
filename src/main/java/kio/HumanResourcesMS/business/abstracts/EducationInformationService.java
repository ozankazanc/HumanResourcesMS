package kio.HumanResourcesMS.business.abstracts;

import java.util.List;

import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.entities.concretes.EducationInformation;

public interface EducationInformationService {

	Result add(EducationInformation educationInformation);
	
	DataResult<List<EducationInformation>> getAll();
	DataResult<List<EducationInformation>> getByCurriculumVitae(int cvId);
	
}
