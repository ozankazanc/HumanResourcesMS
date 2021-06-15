package kio.HumanResourcesMS.business.abstracts;

import java.util.List;

import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.entities.concretes.*;

public interface JobExperienceService {
	Result add(JobExperience jobExperience);
	
	DataResult<List<JobExperience>> getAll();
	DataResult<List<JobExperience>> getByCurriculumVitae(int cvid);
}
