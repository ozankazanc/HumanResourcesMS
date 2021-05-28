package kio.HumanResourcesMS.business.abstracts;

import java.util.List;

import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.entities.concretes.Job;

public interface JobService {

	DataResult<List<Job>> getAll();

	Result add(Job job);
}
