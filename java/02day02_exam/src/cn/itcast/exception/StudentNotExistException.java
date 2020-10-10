package cn.itcast.exception;

public class StudentNotExistException extends Exception {

	public StudentNotExistException() {
	}

	public StudentNotExistException(String message) {
		super(message);
	}

	public StudentNotExistException(Throwable cause) {
		super(cause);
	}

	public StudentNotExistException(String message, Throwable cause) {
		super(message, cause);
	}

}
