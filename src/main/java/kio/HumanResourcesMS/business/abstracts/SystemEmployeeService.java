package kio.HumanResourcesMS.business.abstracts;

import kio.HumanResourcesMS.entities.concretes.*;
import java.util.List;
import kio.HumanResourcesMS.core.utilities.results.*;

public interface SystemEmployeeService {
	DataResult<List<SystemEmployee>> getAll();
}
