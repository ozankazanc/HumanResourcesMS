package kio.HumanResourcesMS.business.abstracts;

import java.util.List;


import kio.HumanResourcesMS.entities.concretes.Job;

public interface JobService {

	List<Job> getAll();
	
}
