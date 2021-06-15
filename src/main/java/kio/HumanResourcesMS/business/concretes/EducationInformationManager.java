package kio.HumanResourcesMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kio.HumanResourcesMS.business.abstracts.EducationInformationService;
import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.dataAccess.abstracts.EducationInformationDao;
import kio.HumanResourcesMS.entities.concretes.EducationInformation;

@Service
public class EducationInformationManager implements EducationInformationService {

	private EducationInformationDao educationInformationDao ;
	
	@Autowired
	public EducationInformationManager(EducationInformationDao educationInformationDao) {
		super();
		this.educationInformationDao=educationInformationDao;
	}
	
	@Override
	public Result add(EducationInformation educationInformation) {
		this.educationInformationDao.save(educationInformation);
		return new SuccessResult("Eklendi.");
	}

	@Override
	public DataResult<List<EducationInformation>> getAll() {
		return new SuccessDataResult<List<EducationInformation>>(this.educationInformationDao.findAll(),"Listelendi.");
	}

	@Override
	public DataResult<List<EducationInformation>> getByCurriculumVitae(int cvId) {
		return new SuccessDataResult<List<EducationInformation>>
		(this.educationInformationDao.getByCurriculumVitae_Id(cvId),"Listelendi.");
	}

	
}
