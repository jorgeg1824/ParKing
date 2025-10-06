package co.edu.uco.parking.crosscuting.helper;

public final class ObjectHelper {
	
	private ObjectHelper() {
	}
	
	public static <O> boolean isNull(final O object) {
		return object == null;
	}
	
	public static <O> O getDefault(final O object, final O defaultValue) {
		return isNull(object) ? defaultValue : object;
	}
	
}
