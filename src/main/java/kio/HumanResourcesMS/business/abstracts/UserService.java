package kio.HumanResourcesMS.business.abstracts;

import kio.HumanResourcesMS.core.utilities.results.DataResult;
import kio.HumanResourcesMS.entities.concretes.User;

public interface UserService {
	
	DataResult<User> checkEmail(String email);
}
