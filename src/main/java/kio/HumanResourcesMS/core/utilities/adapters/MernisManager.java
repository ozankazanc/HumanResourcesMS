package kio.HumanResourcesMS.core.utilities.adapters;

public class MernisManager implements MernisService {

	@Override
	public boolean controlIdentity(String tc, String firstName, String lastName, int birthDate) {
		return true;
	}

}
