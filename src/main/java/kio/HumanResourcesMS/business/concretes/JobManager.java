package kio.HumanResourcesMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kio.HumanResourcesMS.business.abstracts.JobService;
import kio.HumanResourcesMS.dataAccess.abstracts.JobDao;
import kio.HumanResourcesMS.entities.concretes.Job;

@Service
public class JobManager implements JobService {

	private JobDao jobDao;

	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}

	@Override
	public List<Job> getAll() {
		return this.jobDao.findAll();
	}

	@Override
	public Job getById(int id) {
		return this.jobDao.getOne(id);

	}

	@Override
	public void add(Job job) {

		Job jobPosition = this.jobDao.findbyJobPosition(job.getJobPosition());
		if(jobPosition==null)
		{
			this.jobDao.save(job);
		}
		else
		{
			
		}
	}
}
