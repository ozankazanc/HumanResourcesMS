package kio.HumanResourcesMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kio.HumanResourcesMS.business.abstracts.CityService;
import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.dataAccess.abstracts.CityDao;
import kio.HumanResourcesMS.entities.concretes.City;

@Service
public class CityManager implements CityService {

	private CityDao cityDao;
	
	@Autowired
	public CityManager (CityDao cityDao)
	{
		super();
		this.cityDao = cityDao;
	}
	
	@Override
	public DataResult<List<City>> getAll() {
		try
		{
			return new SuccessDataResult<List<City>>(this.cityDao.findAll(),"Listelendi");
		}
		catch(Exception ex)
		{
			return new ErrorDataResult<List<City>>("Listelenemedi.");
		}
	}
	
	@Override
	public Result add(City city) {
		try
		{
			this.cityDao.save(city);
			return new SuccessResult("Şehir eklendi.");
		}
		catch(Exception ex)
		{
			return new ErrorResult("Eklenemedi.");
		}
	}

	
}
