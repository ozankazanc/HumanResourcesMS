package kio.HumanResourcesMS.core.utilities.verification;

public class VerificationManager implements VerificationService {

	@Override
	public void verifyByEmployee(int userId) {
		
		System.out.println("Onaylandı. :" +userId);
	}

	@Override
	public void verifyByCode(String code, String email) {
		System.out.println(code+" onaylama kodu mailinize gönderildi. : "+email);
		
	}

}
