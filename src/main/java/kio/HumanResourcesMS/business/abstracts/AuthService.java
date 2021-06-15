package kio.HumanResourcesMS.business.abstracts;

import kio.HumanResourcesMS.core.utilities.results.DataResult;
import kio.HumanResourcesMS.entities.concretes.*;

public interface AuthService {
	DataResult<Jobseeker> registerJobHunter(Jobseeker jobseeker);

	DataResult<Employer> registerEmployer(Employer employer);
}
