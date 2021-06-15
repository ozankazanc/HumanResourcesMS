package kio.HumanResourcesMS.business.concretes;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kio.HumanResourcesMS.business.abstracts.JobExperienceService;
import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.dataAccess.abstracts.JobExperienceDao;
import kio.HumanResourcesMS.entities.concretes.JobExperience;

@Service
public class JobExperienceManager implements JobExperienceService {

	private JobExperienceDao jobExperienceDao;
	
	@Autowired
	public JobExperienceManager(JobExperienceDao jobExperienceDao) {
		super();
		this.jobExperienceDao = jobExperienceDao;
	}
	
	@Override
	public Result add(JobExperience jobExperience) {
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult("Eklendi.");
	}

	@Override
	public DataResult<List<JobExperience>> getAll() {
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.findAll(),"Listelendi.");
	}

	@Override
	public DataResult<List<JobExperience>> getByCurriculumVitae(int cvid) {
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.getByCurriculumVitae_Id(cvid),"Listelendi.");
	}

	
}
