package kio.HumanResourcesMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kio.HumanResourcesMS.business.abstracts.JobAdvertisementService;
import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.dataAccess.abstracts.JobAdvertisementDao;
import kio.HumanResourcesMS.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager (JobAdvertisementDao jobAdvertisementDao)
	{
		super();
		this.jobAdvertisementDao= jobAdvertisementDao;
	}
	
	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(),"Listelendi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllSortedByActive() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsActive(),"Listelendi.");
	}

	@Override
	public Result add(JobAdvertisement advertisement) {
		try
		{
			this.jobAdvertisementDao.save(advertisement);
			return new SuccessResult("İlan Eklendi.");
		}
		catch(Exception ex)
		{
			return new ErrorResult("İlan Eklenemedi." + ex.getMessage());
		}
	}

	@Override
	public Result update(JobAdvertisement advertisement) {
		try
		{
			this.jobAdvertisementDao.save(advertisement);
			return new SuccessResult("İlan Güncellendi.");
		}
		catch(Exception ex)
		{
			return new ErrorResult("İlan Güncellenemedi." + ex.getMessage());
		}
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByActiveOneCompany(String companyName) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByActiveOneCompany(companyName),"Listelendi.");
	}

}
