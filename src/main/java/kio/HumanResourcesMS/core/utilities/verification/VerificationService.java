package kio.HumanResourcesMS.core.utilities.verification;

public interface VerificationService {

	void verifyByEmployee(int userId);

	void verifyByCode(String code, String email);
}
