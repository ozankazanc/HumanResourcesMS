package kio.HumanResourcesMS.business.abstracts;

import java.util.List;

import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.entities.concretes.Jobseeker;

public interface JobSeekerService {
	DataResult<List<Jobseeker>> getAll();

	Result add(Jobseeker jobHunt);

}
