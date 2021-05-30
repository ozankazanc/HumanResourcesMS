package kio.HumanResourcesMS.business.abstracts;

import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.entities.concretes.*;
import java.util.List;

public interface CityService {
	
	DataResult<List<City>> getAll();
	Result add(City city);
}
