package kio.HumanResourcesMS.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kio.HumanResourcesMS.business.abstracts.ImageService;
import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.core.utilities.uploads.ImageHelper;
import kio.HumanResourcesMS.core.utilities.uploads.ImageUploadService;
import kio.HumanResourcesMS.dataAccess.abstracts.ImageDao;
import kio.HumanResourcesMS.entities.concretes.CurriculumVitae;
import kio.HumanResourcesMS.entities.concretes.Image;

@Service
public class ImageManager implements ImageService{

	private ImageDao imageDao;
	private ImageUploadService imageUploadService;
	
	
	@Autowired
	public ImageManager(ImageHelper imageUploadService,ImageDao imageDao) {
		super();
		this.imageDao = imageDao;
		this.imageUploadService=imageUploadService;
	}
	
	@Override
	public Result upload(int id, MultipartFile file) {

		@SuppressWarnings("unchecked")
		Map<String,String> mdl=(Map<String,String>)this.imageUploadService.upload(file).getData();
		
		CurriculumVitae cv=new CurriculumVitae();
		Image image =new Image();
		cv.setId(id);
		image.setCurriculumVitae(cv);
		image.setImageUrl(mdl.get("url"));
		
		this.imageDao.save(image);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<Image>> getAll() {
		
		return new SuccessDataResult<List<Image>>(this.imageDao.findAll());
	}

	@Override
	public DataResult<List<Image>> getByCurriculumVitae(int cvid) {
		return new SuccessDataResult<List<Image>>(this.imageDao.getByCurriculumVitae_Id(cvid));
	}

}
