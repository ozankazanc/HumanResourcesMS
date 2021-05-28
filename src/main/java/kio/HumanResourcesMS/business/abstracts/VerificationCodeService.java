package kio.HumanResourcesMS.business.abstracts;

import kio.HumanResourcesMS.core.utilities.results.Result;

public interface VerificationCodeService {
	Result add (int UserId);
	String generateCode ();
}
