package pl.edu.uj.tcs.programowanie07.compositionandinheritance;

/**
 * A class which is a very naive model of a computer.
 * 
 * @author kozik
 * 
 */

public class Class01BasicComposition {

	static class Processor {
		int id;

		Processor(int id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "processor: " + id;
		}
	}

	static class MotherBoard {
		int id;

		MotherBoard(int id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "motherboard: " + id;
		}

	}

	static class Computer {
		Processor proc;
		MotherBoard mb;

		Computer(Processor proc, MotherBoard mb) {
			this.proc = proc;
			this.mb = mb;
		}

		@Override
		public String toString() {
			return "Computer with [" + proc + ", " + mb + "]";
		}
	}

	public static void main(String[] args) {
		System.out
				.println(new Computer(new Processor(12), new MotherBoard(21)));
	}

}
