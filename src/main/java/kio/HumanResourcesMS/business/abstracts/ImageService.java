package kio.HumanResourcesMS.business.abstracts;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;
import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.entities.concretes.*;

public interface ImageService {
	
	Result upload(int id, MultipartFile file);

	DataResult<List<Image>> getByCurriculumVitae(int cvid);

	DataResult<List<Image>> getAll();
}
