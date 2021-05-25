package kio.HumanResourcesMS.business.abstracts;

import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.entities.concretes.Employer;

public interface EmployerCheckService {
	
	Result checkDuplicateMail (String mailAdress);
	DataResult<Employer> checkDomainOfMail(Employer employer);
}
