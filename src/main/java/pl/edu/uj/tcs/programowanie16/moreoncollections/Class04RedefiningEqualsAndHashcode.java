package pl.edu.uj.tcs.programowanie16.moreoncollections;

import java.util.HashSet;
import java.util.Set;
/**
 * Examples of behavior of containers on classes with incorrectly defined equals.
 * 
 * @author kozik
 *
 */
public class Class04RedefiningEqualsAndHashcode {

	/**
	 * @param args
	 */
	public static class A {
	}
	/**
	 * A very bad implementation of equals and of hashCode.
	 * 
	 * @author kozik
	 *
	 */
	public static class B {
		@Override
		public boolean equals(Object o) {
			if (o instanceof B)
				return false;
			return false;
		}

		@Override
		public int hashCode() {
			int hash = 5;
			return hash;
		}
	}

	/**
	 * A very bad implementation of equals and of hashCode.
	 * 
	 * @author kozik
	 *
	 */
	public static class C {
		@Override
		public boolean equals(Object o) {
			if (o instanceof C)
				return true;
			return true;
		}

		@Override
		public int hashCode() {
			int hash = 7;
			return hash;
		}
	}

	public static void main(String[] args) {
		Set<A> setA = new HashSet<A>();
		A tempA0 = new A();
		A tempA1 = new A();
		setA.add(tempA0);
		setA.add(tempA1);
		setA.add(tempA0);
		setA.add(tempA1);
		System.out.println("setA: " + setA);
		Set<B> setB = new HashSet<B>();
		B tempB0 = new B();
		B tempB1 = new B();
		setB.add(tempB0);
		setB.add(tempB1);
		setB.add(tempB0);
		setB.add(tempB1);
		System.out.println("setB: " + setB);
		System.out.println("setB: " + setB.size());
		System.out.println("setB: " + setB.contains(tempB0));
		System.out.println("setB: " + setB.contains(tempB1));
		System.out.println(tempB0.equals(tempB1));
		System.out.println(tempB0 == tempB1);
		Set<C> setC = new HashSet<C>();
		C tempC0 = new C();
		C tempC1 = new C();
		setC.add(tempC0);
		setC.add(tempC1);
		setC.add(tempC0);
		setC.add(tempC1);
		System.out.println("setC: " + setC);
		System.out.println("setC: " + setC.size());
		System.out.println("setC: " + setC.contains(tempC0));
		System.out.println("setC: " + setC.contains(tempC1));
		System.out.println(tempC0.equals(tempC1));
		System.out.println(tempC0 == tempC1);
	}

}
