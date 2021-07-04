package kio.HumanResourcesMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kio.HumanResourcesMS.business.abstracts.SystemEmployeeService;
import kio.HumanResourcesMS.core.utilities.results.DataResult;
import kio.HumanResourcesMS.core.utilities.results.SuccessDataResult;
import kio.HumanResourcesMS.dataAccess.abstracts.SystemEmployeeDao;
import kio.HumanResourcesMS.entities.concretes.SystemEmployee;

@Service
public class SystemEmployeeManager implements SystemEmployeeService {

	private SystemEmployeeDao systemEmployeeDao;
	
	@Autowired
	public SystemEmployeeManager (SystemEmployeeDao systemEmployeeDao)
	{
		this.systemEmployeeDao= systemEmployeeDao;
	}
	
	
	@Override
	public DataResult<List<SystemEmployee>> getAll() {
		
		return new SuccessDataResult<List<SystemEmployee>>(this.systemEmployeeDao.findAll());
	}

	
}
