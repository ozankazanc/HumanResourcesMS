package kio.HumanResourcesMS.business.abstracts;

import java.util.List;

import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	DataResult<List<JobAdvertisement>> getAll();

	DataResult<List<JobAdvertisement>> getAllSortedByActive();

	DataResult<List<JobAdvertisement>> getAllSortedByDate();

	Result add(JobAdvertisement advertisement);

	Result update(JobAdvertisement advertisement);
}
