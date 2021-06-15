package kio.HumanResourcesMS.business.abstracts;

import java.util.List;

import kio.HumanResourcesMS.core.utilities.results.DataResult;
import kio.HumanResourcesMS.core.utilities.results.Result;
import kio.HumanResourcesMS.entities.concretes.LanguageInformation;

public interface LanguageInformationService {
	Result add(LanguageInformation languageInformation);

	DataResult<List<LanguageInformation>> getAll();

	DataResult<List<LanguageInformation>> getByCurriculumVitae(int cvid);
}
