package kio.HumanResourcesMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kio.HumanResourcesMS.business.abstracts.ContactInformationService;
import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.dataAccess.abstracts.ContactInformationDao;
import kio.HumanResourcesMS.entities.concretes.ContactInformation;

@Service
public class ContactInformationManager implements ContactInformationService {

	
	private ContactInformationDao contactInformationDao;
	
	@Autowired
	public ContactInformationManager(ContactInformationDao contactInformationDao) {
		super();
		this.contactInformationDao = contactInformationDao;
	}

	@Override
	public Result add(ContactInformation contactInformation) {
		this.contactInformationDao.save(contactInformation);
		return new SuccessResult("Eklendi");
	}

	@Override
	public DataResult<List<ContactInformation>> getAll() {
		return new SuccessDataResult<List<ContactInformation>>(this.contactInformationDao.findAll(),"Listelendi");
	}

	@Override
	public DataResult<List<ContactInformation>> getByCurriculumVitae(int cvid) {
		return new SuccessDataResult<List<ContactInformation>>
		(this.contactInformationDao.getByCurriculumVitae_Id(cvid),"Listelendi");
	}

	

}
