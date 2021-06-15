package kio.HumanResourcesMS.core.utilities.uploads;

import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Service;

import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kio.HumanResourcesMS.core.utilities.results.*;

@Service
public class ImageHelper implements ImageUploadService {

	public DataResult<Map> upload(MultipartFile file) {
		Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "getschwifty",
				"api_key", "795951365228141",
				"api_secret", "loqDWd1gVTbNNvxCADnMbUEhMt4"));

		try {
			Map uploadResult = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
			return new SuccessDataResult<Map>(uploadResult);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ErrorDataResult<Map>();
	}

}
