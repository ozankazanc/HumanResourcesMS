package kio.HumanResourcesMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kio.HumanResourcesMS.business.abstracts.EmployerCheckService;
import kio.HumanResourcesMS.business.abstracts.EmployerService;
import kio.HumanResourcesMS.core.utilities.results.DataResult;
import kio.HumanResourcesMS.core.utilities.results.ErrorDataResult;
import kio.HumanResourcesMS.core.utilities.results.Result;
import kio.HumanResourcesMS.core.utilities.results.SuccessDataResult;
import kio.HumanResourcesMS.dataAccess.abstracts.EmployerDao;
import kio.HumanResourcesMS.entities.concretes.Employer;


@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	private EmployerCheckService employerCheckService;

	@Autowired
	public EmployerManager(EmployerDao employerDao,EmployerCheckService employerCheckService) {
		super();
		this.employerDao = employerDao;
		this.employerCheckService =employerCheckService;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		try {
			return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "Listelendi.");
		} catch (Exception ex) {
			return new ErrorDataResult<List<Employer>>("Listelenemedi. Nedeni: " + ex.getMessage());
		}
	}

	@Override
	public Result add(Employer employer) {
//		if(!employerCheckService.checkDuplicateMail(employer.getMail()).getSuccess())
//		{
//			return null;
//		}
		return null;
	}

}
