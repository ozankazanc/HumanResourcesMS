package kio.HumanResourcesMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kio.HumanResourcesMS.business.abstracts.JobPositionCheckService;
import kio.HumanResourcesMS.business.abstracts.JobService;
import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.dataAccess.abstracts.JobDao;
import kio.HumanResourcesMS.entities.concretes.Job;

@Service
public class JobManager implements JobService {

	private JobDao jobDao;
	private JobPositionCheckService jobPositionCheckService;

	@Autowired
	public JobManager(JobDao jobDao, JobPositionCheckService jobPositionCheckService) {
		super();
		this.jobDao = jobDao;
		this.jobPositionCheckService = jobPositionCheckService;
	}

	@Override
	public DataResult<List<Job>> getAll() {

		try {
			return new SuccessDataResult<List<Job>>(this.jobDao.findAll(), "Listelendi.");
		} catch (Exception ex) {
			return new ErrorDataResult<List<Job>>("Listelenemedi. Nedeni: " + ex.getMessage());
		}
	}
	
	@Override
	public Result add(Job job) {

		try {
			if (jobPositionCheckService.getByJobPosition(job.getJobPosition()).getSuccess() == true) {

				this.jobDao.save(job);
				return new SuccessResult("İş pozisyonu eklenmiştir.");
			} else {

				return new ErrorResult("Eklemek istediğiniz iş pozisyonu zaten bulunmaktadır.");
			}
		} catch (Exception ex) {

			return new ErrorResult("Sistemsel hata. Nedeni: " + ex.getMessage());
		}

	}

}
