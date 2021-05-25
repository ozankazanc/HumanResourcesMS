package kio.HumanResourcesMS.business.abstracts;

import kio.HumanResourcesMS.core.utilities.results.*;

public interface JobPositionCheckService {
	
	Result getByJobPosition(String jobPosition);
}
