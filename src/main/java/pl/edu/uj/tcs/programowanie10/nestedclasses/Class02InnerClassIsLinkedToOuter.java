package pl.edu.uj.tcs.programowanie10.nestedclasses;

public class Class02InnerClassIsLinkedToOuter {

	static int noOfObjects = 0;
	final int myId;

	public Class02InnerClassIsLinkedToOuter() {
		myId = noOfObjects++;
	}

	public LittleInner getInner() {
		return new LittleInner();
	}

	public class LittleInner {
		int id() {
			return myId;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class02InnerClassIsLinkedToOuter[] temp = new Class02InnerClassIsLinkedToOuter[10];
		for (int i = 0; i < 10; i++)
			temp[i] = new Class02InnerClassIsLinkedToOuter();
		for (int i = 9; i >= 0; i--)
			System.out
					.println("I am within Class02InnerClassIsLinkedToOuter.myId = "
							+ temp[i].getInner().id());
	}

}
