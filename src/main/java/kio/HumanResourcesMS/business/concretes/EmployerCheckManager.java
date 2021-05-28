package kio.HumanResourcesMS.business.concretes;

import org.springframework.stereotype.Service;

import kio.HumanResourcesMS.business.abstracts.EmployerCheckService;
import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.dataAccess.abstracts.EmployerDao;
import kio.HumanResourcesMS.entities.concretes.Employer;

@Service
public class EmployerCheckManager implements EmployerCheckService {

	private EmployerDao employerDao;
	//SAHTE SERVİS
	public EmployerCheckManager(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}

	@Override
	public Result checkDuplicateMail(String mailAdress) {
		
		try {
			if (this.checkDuplicateMail(mailAdress).getSuccess() == true) {
				return new SuccessResult();
			} else {
				return new ErrorResult();

			}
		} catch (Exception ex) {
			return new ErrorResult("Sistemsel hata. Nedeni: " + ex.getMessage());
		}

	}

	@Override
	public DataResult<Employer> checkDomainOfMail(Employer employer) {

		return null;
//		try {
//			if (this.checkDomainOfMail(employer).getData().getMail() == "") {
//				return new SuccessDataResult<Employer>("Uygun mail");
//			} else {
//				return new ErrorDataResult<Employer>("Bu mail sistemde bulunmakta.");
//
//			}
//		} catch (Exception ex) {
//			return new ErrorDataResult<Employer>("Sistemsel hata. Nedeni: " + ex.getMessage());
//		}
	}

}
