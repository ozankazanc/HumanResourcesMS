package kio.HumanResourcesMS.business.abstracts;

import kio.HumanResourcesMS.core.utilities.results.DataResult;
import kio.HumanResourcesMS.entities.concretes.*;
import java.util.List;

public interface CityService {
	DataResult<List<City>> getAll();
}
