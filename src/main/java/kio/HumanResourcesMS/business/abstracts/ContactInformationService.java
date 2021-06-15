package kio.HumanResourcesMS.business.abstracts;

import java.util.List;

import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.entities.concretes.*;

public interface ContactInformationService {

	Result add(ContactInformation contactInformation);
	
	DataResult<List<ContactInformation>> getAll();
	DataResult<List<ContactInformation>> getByCurriculumVitae(int cvid);
}
