package pl.edu.uj.tcs.programowanie10.nestedclasses;
/**
 * An example of initializing anonymous classes.
 * 
 * @author kozik
 *
 */
public class Class07NoConstructorsForAnonymous {

	public interface Stamp {
		public String stampValue();
	}

	public final Stamp myStamp;

	public Class07NoConstructorsForAnonymous(final String a) {
		myStamp = new Stamp() {
			final String stamp;
			{
				stamp = "<" + new java.util.Random().nextInt(100) + "," + a
						+ ">";
			}
			
			@Override
			public String stampValue() {
				return stamp;
			}
		};
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new Class07NoConstructorsForAnonymous("Ala").myStamp
				.stampValue());
		System.out.println(new Class07NoConstructorsForAnonymous("ma").myStamp
				.stampValue());
		System.out
				.println(new Class07NoConstructorsForAnonymous("kota").myStamp
						.stampValue());
		Stamp temp = new Class07NoConstructorsForAnonymous("???").myStamp;
		System.out.println(temp.stampValue());
		System.out.println(temp.stampValue());
		System.out.println(temp.stampValue());
	}

}
