package pl.edu.uj.tcs.programowanie13.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class NoWayToDoAnything {
	private int i;
	private final int j = 0;

	private NoWayToDoAnything() {
	}

	@SuppressWarnings("unused")
	private void yeah() {
		System.out.println("yeah " + i + " " + j);
	}
}
/**
 * An example of ignoring the access restrictions on constructors/fields/methods.
 * 
 * @author marcin
 *
 */
public class Class11IgnoringAccessRestrictions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class<NoWayToDoAnything> cl = NoWayToDoAnything.class;
		try {
			Constructor<NoWayToDoAnything> constr = cl.getDeclaredConstructor();
			constr.setAccessible(true);
			NoWayToDoAnything n = constr.newInstance();
			Field fi = cl.getDeclaredField("i");
			fi.setAccessible(true);
			fi.setInt(n, 173);
			Method me = cl.getDeclaredMethod("yeah");
			me.setAccessible(true);
			me.invoke(n);
			fi = cl.getDeclaredField("j");
			fi.setAccessible(true);
			fi.setInt(n, 173);
			me.invoke(n);
		} catch (Exception e) {
			System.out.println("Failed: " + e);
		}
	}
}
