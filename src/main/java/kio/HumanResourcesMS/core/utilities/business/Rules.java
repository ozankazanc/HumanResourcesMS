package kio.HumanResourcesMS.core.utilities.business;

import kio.HumanResourcesMS.core.utilities.results.Result;

public class Rules {
	
	public static Result Run(Result... results) {
		for (Result result : results) {
			if (!result.getSuccess()) {
				return result;
			}
		}
		return null;
	}
}
