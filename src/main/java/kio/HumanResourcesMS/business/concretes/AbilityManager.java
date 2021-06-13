package kio.HumanResourcesMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kio.HumanResourcesMS.business.abstracts.*;
import kio.HumanResourcesMS.dataAccess.abstracts.*;
import kio.HumanResourcesMS.entities.concretes.*;
import kio.HumanResourcesMS.core.utilities.results.*;

@Service
public class AbilityManager implements AbilityService {

	@Autowired
	private AbilityDao abilityDao;
	
	public AbilityManager(AbilityDao abilityDao) {
		this.abilityDao = abilityDao;
	}
	
	@Override
	public Result add(Ability ability) {
		this.abilityDao.save(ability);
		return new SuccessResult("Yetenek eklendi.");
	}

	@Override
	public DataResult<List<Ability>> getAll() {
		return new SuccessDataResult<List<Ability>>(this.abilityDao.findAll(),"Yetenekler listelendi.");
	}

	@Override
	public DataResult<List<Ability>> getByCurriculumVitae(int cvid) {
		return new SuccessDataResult<List<Ability>>(this.abilityDao.getByCurriculumVitae_Id(cvid));
	}

}
