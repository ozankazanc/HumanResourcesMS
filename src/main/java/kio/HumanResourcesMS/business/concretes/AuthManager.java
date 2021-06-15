package kio.HumanResourcesMS.business.concretes;

import kio.HumanResourcesMS.business.abstracts.AuthService;
import kio.HumanResourcesMS.core.utilities.results.DataResult;
import kio.HumanResourcesMS.entities.concretes.Employer;
import kio.HumanResourcesMS.entities.concretes.Jobseeker;

public class AuthManager implements AuthService{

	
	@Override
	public DataResult<Jobseeker> registerJobHunter(Jobseeker jobseeker) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Employer> registerEmployer(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}

}
