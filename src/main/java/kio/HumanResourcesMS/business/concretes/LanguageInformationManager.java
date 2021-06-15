package kio.HumanResourcesMS.business.concretes;

import java.util.List;

import kio.HumanResourcesMS.business.abstracts.LanguageInformationService;
import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.dataAccess.abstracts.LanguageInformationDao;
import kio.HumanResourcesMS.entities.concretes.LanguageInformation;

public class LanguageInformationManager implements LanguageInformationService {

	private LanguageInformationDao languageInformationDao;

	public LanguageInformationManager(LanguageInformationDao languageInformationDao) {
		super();
		this.languageInformationDao = languageInformationDao;
	}

	@Override
	public Result add(LanguageInformation languageInformation) {
		this.languageInformationDao.save(languageInformation);
		return new SuccessResult("Eklendi.");
	}

	@Override
	public DataResult<List<LanguageInformation>> getAll() {
		return new SuccessDataResult<List<LanguageInformation>>(this.languageInformationDao.findAll(),"Listelendi.");
	}

	@Override
	public DataResult<List<LanguageInformation>> getByCurriculumVitae(int cvid) {
		return new SuccessDataResult<List<LanguageInformation>>
		(this.languageInformationDao.getByCurriculumVitae_Id(cvid),"Listelendi.");
	}

}
