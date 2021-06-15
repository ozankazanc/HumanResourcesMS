package kio.HumanResourcesMS.core.utilities.uploads;

import java.util.Map;
import org.springframework.web.multipart.MultipartFile;
import kio.HumanResourcesMS.core.utilities.results.DataResult;

public interface ImageUploadService {
	 DataResult<Map> upload(MultipartFile file);
}
