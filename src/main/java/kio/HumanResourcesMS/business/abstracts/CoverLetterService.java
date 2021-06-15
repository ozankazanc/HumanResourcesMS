package kio.HumanResourcesMS.business.abstracts;

import java.util.List;

import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.entities.concretes.CoverLetter;

public interface CoverLetterService {

	Result add(CoverLetter coverLetter);
	
	DataResult<List<CoverLetter>> getAll();
	DataResult<List<CoverLetter>> getbyCurriculumVitae(int cvId);
}
