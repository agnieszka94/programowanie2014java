package pl.edu.uj.tcs.programowanie09.abstractclassesandinterfaces;

/**
 * Interfaces fit very well with decorator pattern.
 * 
 * @author marcin
 *
 */
public class Class03DecoratorPatternViaInterfaces {
	interface Decorator {
		String decorate(String st);
	}

	static class EmptyDecorator implements Decorator {
		@Override
		public String decorate(String str) {
			return str;
		}
	}

	static abstract class AbstractDecorator implements Decorator {
		protected final Decorator oldDecorator;

		AbstractDecorator() {
			oldDecorator = new EmptyDecorator();
		}

		AbstractDecorator(Decorator oldDecorator) {
			this.oldDecorator = oldDecorator;
		}
	}

	static class HTMLComment extends AbstractDecorator {
		HTMLComment() {
		}

		HTMLComment(Decorator oldDecorator) {
			super(oldDecorator);
		}

		@Override
		public String decorate(String str) {
			return "<!-- " + oldDecorator.decorate(str) + " -->";
		}
	}

	static class InsertStars extends AbstractDecorator {
		InsertStars() {
		}

		InsertStars(Decorator oldDecorator) {
			super(oldDecorator);
		}

		@Override
		public String decorate(String str) {
			StringBuilder strBuild = new StringBuilder("*");
			for (char c : oldDecorator.decorate(str).toCharArray())
				strBuild.append(c).append("*");
			return strBuild.toString();
		}
	}

	public static void main(String[] args) {
		Decorator temp = new HTMLComment(new InsertStars());
		System.out.println(temp.decorate("Hello World!"));
		temp = new InsertStars(temp);
		System.out.println(temp.decorate("Hello World!"));
	}
}
