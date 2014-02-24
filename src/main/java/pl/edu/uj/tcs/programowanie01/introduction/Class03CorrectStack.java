package pl.edu.uj.tcs.programowanie01.introduction;

import java.util.EmptyStackException;

public class Class03CorrectStack {
	private Object[] elements;
	private int size = 0;

	public Class03CorrectStack(int initialCapacity) {
		this.elements = new Object[initialCapacity];
	}

	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop() {
		if (size == 0)
			throw new EmptyStackException();
		elements[size] = null;
		return elements[--size];
	}

	private void ensureCapacity() {
		if (elements.length == size) {
			Object[] oldElements = elements;
			elements = new Object[2 * elements.length + 1];
			System.arraycopy(oldElements, 0, elements, 0, size);
		}
	}
}