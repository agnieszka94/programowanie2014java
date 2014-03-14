package pl.edu.uj.tcs.programowanie13.reflection;

import java.util.HashMap;
import java.util.Map;
/**
 * An example storing objects of different classes. 
 * 
 * @author marcin
 *
 */
public class Class06Zoo {

	private final Map<Class<?>, Object> zoo = new HashMap<Class<?>, Object>();

	public boolean put(Object o) {
		if (zoo.containsKey(o.getClass()))
			return false;
		zoo.put(o.getClass(), o);
		return true;
	}

	public boolean putAny(Class<?> c) {
		try {
			return put(c.newInstance());
		} catch (Exception e) {
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	public <T> T get(Class<? extends T> c) {
		return (T) zoo.get(c);
	}

	public Map<Class<?>, Integer> whatDoWeHave() {
		Map<Class<?>, Integer> map = new HashMap<Class<?>, Integer>();
		for (Object o : zoo.values())
			process(map, o.getClass());
		return map;
	}

	private void process(Map<Class<?>, Integer> map, Class<?> c) {
		if (c == null)
			return;
		map.put(c, (map.get(c) == null) ? 1 : map.get(c) + 1);
		process(map, c.getSuperclass());
		for (Class<?> d : c.getInterfaces())
			process(map, d);
	}

	@Override
	public String toString() {
		return zoo.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class06Zoo zoo = new Class06Zoo();
		System.out.println(zoo.put("Ala"));
		System.out.println(zoo.put(1));
		System.out.println(zoo.put(2));
		System.out.println(zoo);
		System.out.println(zoo.putAny(Class06Zoo.class));
		System.out.println(zoo);
		String str = zoo.get(String.class);
		System.out.println(str);
		Object obj = zoo.<Object> get(Integer.class);
		System.out.println(obj);
		obj = zoo.<Integer> get(Integer.class);
		System.out.println(obj);
		zoo.put(1.0);
		zoo.put(new Object());
		System.out.println(zoo);
		System.out.println(zoo.whatDoWeHave());
	}

}
