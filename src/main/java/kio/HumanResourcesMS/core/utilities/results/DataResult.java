package kio.HumanResourcesMS.core.utilities.results;

public class DataResult<T> extends Result {

	private T Data;

	public DataResult(T Data, boolean success, String message) {
		super(success, message);
		this.Data = Data;
		// TODO Auto-generated constructor stub
	}

	public DataResult(T Data, boolean success) {
		super(success);
		this.Data = Data;
		// TODO Auto-generated constructor stub
	}

	public T getData() {
		return Data;
	}
}
