package kio.HumanResourcesMS.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kio.HumanResourcesMS.business.abstracts.JobPositionCheckService;
import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.dataAccess.abstracts.JobDao;

@Service
public class JobPositionCheckManager implements JobPositionCheckService {

	private JobDao jobDao;

	@Autowired
	public JobPositionCheckManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}

	@Override
	public Result getByJobPosition(String jobPosition) {

		if (this.jobDao.findbyJobPosition(jobPosition) == null) {
			return new SuccessResult();
		} else {
			return new ErrorResult();
		}
	}

}
