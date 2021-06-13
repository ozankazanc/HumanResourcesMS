package kio.HumanResourcesMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kio.HumanResourcesMS.business.abstracts.CurriculumVitaeService;
import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.dataAccess.abstracts.CurriculumVitaeDao;
import kio.HumanResourcesMS.entities.concretes.CurriculumVitae;

@Service
public class CurriculumVitaeManager implements CurriculumVitaeService{

	private CurriculumVitaeDao curriculumVitaeDao;
	
	@Autowired
	public CurriculumVitaeManager(CurriculumVitaeDao curriculumVitaeDao) {
		super();
		this.curriculumVitaeDao = curriculumVitaeDao;
	}
	
	@Override
	public Result add(CurriculumVitae curriculumVitae) {
		this.curriculumVitaeDao.save(curriculumVitae);
		return new SuccessResult("CV Eklendi.");
	}

	@Override
	public Result update(CurriculumVitae curriculumVitae) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<CurriculumVitae>> getAll() {
		return new SuccessDataResult<List<CurriculumVitae>>(this.curriculumVitaeDao.findAll(),"CV'ler listelendi");
	}

	@Override
	public DataResult<List<CurriculumVitae>> getByAllCvJobseeker(int joobseekerId) {
		return new SuccessDataResult<List<CurriculumVitae>>
		(this.curriculumVitaeDao.getByJobseeker_userId(joobseekerId),"CV'ler listelendi");
	}

	@Override
	public DataResult<CurriculumVitae> getByIdCvJobseeker(int cvId) {
		return new SuccessDataResult<CurriculumVitae>
		(this.curriculumVitaeDao.getById(cvId),"CV listelendi");
	}

	

}
