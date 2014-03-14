package pl.edu.uj.tcs.programowanie14.generics;
/**
 * Keeping the type information at runtime by using a type tag.
 * 
 * @author marcin
 *
 * @param <T>
 */
public class Class10TypeTag<T> {

	Class<T> typeTag;

	public Class10TypeTag(Class<T> typeTag) {
		this.typeTag = typeTag;
	}

	public String toString() {
		return super.toString() + "<" + typeTag.getSimpleName() + ">";
	}

	/**
	 * @param args
	 */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		System.out.println(new Class10TypeTag<String>(String.class));
		System.out.println(new Class10TypeTag<Integer>(Integer.class));
		// the following line is a bit of a problem
		System.out.println(new Class10TypeTag<Class10TypeTag>(
				Class10TypeTag.class));
		// System.out.println(new Class10TypeTag<String>(Integer.class));
		// compile-time error
		// System.out.println(new Class10TypeTag<Object>(Integer.class));
		// compile-time error
	}

}
