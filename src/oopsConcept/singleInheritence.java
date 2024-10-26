package oopsConcept;

public class singleInheritence {
	

		public static void main(String[] args) {
			child24 c = new child24();
			c.method1();
			c.method2();
			c.method3();
			c.method4();
			

		}

	}

	class Superclass {
		

		public void method1() {
			System.out.println("m1");
		}

		public void method2() {
			System.out.println("m2");
		}
	}

	class child24 extends Superclass {
		

		public void method3() {
			System.out.println("m3");
		}

		public void method4() {
			System.out.println("m4");
		}

		

	

}
