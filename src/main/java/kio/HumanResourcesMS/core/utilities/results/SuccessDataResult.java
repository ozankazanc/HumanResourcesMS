package kio.HumanResourcesMS.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T> {
	public SuccessDataResult(T Data) {
		super(Data, true);
	}

	public SuccessDataResult(T Data, String message) {
		super(Data, true, message);
	}

	public SuccessDataResult(String message) {
		super(null, true, message);
	}

	public SuccessDataResult() {
		super(null, true);
	}
}
