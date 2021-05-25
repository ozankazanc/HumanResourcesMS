package kio.HumanResourcesMS.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T> {

	public ErrorDataResult(T Data) {
		super(Data, false);
	}

	public ErrorDataResult(T Data, String message) {
		super(Data, false, message);
	}

	public ErrorDataResult(String message) {
		super(null, false, message);
	}

	public ErrorDataResult() {
		super(null, false);
	}
}
