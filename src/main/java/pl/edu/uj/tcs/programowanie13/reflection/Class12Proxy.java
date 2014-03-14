package pl.edu.uj.tcs.programowanie13.reflection;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * A class using a dynamic proxy to classes.
 * 
 * @author marcin
 *
 */
public class Class12Proxy {

	public static class DaHandler implements InvocationHandler {
		private final Object daRealThing;
		private final String id;

		DaHandler(Object daRealThing, String id) {
			this.daRealThing = daRealThing;
			this.id = id;
		}

		public Object invoke(Object pro, Method me, Object[] arg2)
				throws Throwable {
			System.out.println("Proxied by " + id + " calling " + me.getName());
			return me.invoke(daRealThing, arg2);
		}

	}

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		List<Integer> proxy1 = (List<Integer>) Proxy.newProxyInstance(
				List.class.getClassLoader(), new Class[] { List.class },
				new DaHandler(list, "proxy1"));
		CharSequence cS = new String("AlaMaKota");
		CharSequence proxy2 = (CharSequence) Proxy
				.newProxyInstance(List.class.getClassLoader(),
						new Class[] { CharSequence.class }, new DaHandler(cS,
								"proxy2"));
		list.add(4);
		list.add(3);
		proxy1.add(2);
		proxy1.add(1);
		System.out.println(list);
		System.out.println(proxy1);
		Collections.sort(proxy1);
		System.out.println(proxy1);
		System.out.println(proxy2);
		System.out.println(proxy2 + "?");
		System.out.println(proxy2.length());
	}

}
