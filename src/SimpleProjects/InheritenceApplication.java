package SimpleProjects;

import java.util.*;

public class InheritenceApplication {

	public static void main(String[] args) {
		System.out.println("*************************WELCOME*******************");
		System.out.println("&&&&&&&&&&&&& LUCKY UNIVERSITY  &&&&&&&&&&&&&&&&&&&&");
		System.out.println("college code" + " : " + "552552");
		System.out.println("enter your domain");
		System.out.println("1.ug");
		System.out.println("2.pg");
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();

		switch (d) {
		case 1:
			ug u = new ug();
			u.ug();
			// break;
			// Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			switch (a) {
			case 1:
				u.m1();
				int e = sc.nextInt();
				switch (e) {
				case 1:
					u.m1();
					int cc = sc.nextInt();
					switch (cc) {
					case 1:
						u.m8();
						break;
					case 2:
						/*
						 * u.ug(); int cd=sc.nextInt(); switch(cd) { case 1:
						 * 
						 * case 2:
						 * 
						 * 
						 * }
						 */
						System.out.println("please reload page");
					}
				case 2:
					u.ug();
					int ee = sc.nextInt();
					switch (ee) {
					case 1:
						u.m1();
						break;
					case 2:
						u.m();
						break;
					case 3:
						pg p = new pg();
						p.pg();
						int b = sc.nextInt();
						switch (b) {
						case 1:
							p.m2();
							break;
						case 2:
							p.m3();
							break;
						case 3:
							p.m4();
							break;
						}

					}
				}
				break;
			case 2:
				u.m();
				break;
			case 3:
				pg p = new pg();
				p.pg();
				int b = sc.nextInt();
				switch (b) {
				case 1:
					p.m2();
					break;
				case 2:
					p.m3();
					break;
				case 3:
					p.m4();
					break;
				}

			}
			break;

		case 2:
			pg p = new pg();
			p.pg();
			int i = sc.nextInt();
			switch (i) {
			case 1:
				p.m2();
				int e = sc.nextInt();
				switch (e) {
				case 1:
					p.m2();
					break;
				case 2:
					p.m6();
					int f = sc.nextInt();
					switch (f) {
					case 1:
						p.pg();
						break;
					case 2:
						p.m5();
						break;
					}

				}
				break;

			case 2:
				p.m3();
				int g = sc.nextInt();
				switch (g) {
				case 1:
					p.m3();
					break;
				case 2:
					p.m6();
					int h = sc.nextInt();
					switch (h) {
					case 1:
						p.pg();
						break;
					case 2:
						p.m5();
						break;
					}

				}
				break;

			case 3:
				p.m4();
				int lm = sc.nextInt();
				switch (lm) {
				case 1:
					p.m3();
					break;
				case 2:
					p.m6();
					int mn = sc.nextInt();
					switch (mn) {
					case 1:
						p.pg();
						break;
					case 2:
						p.m5();
						break;
					}

				}
				break;
			}

			break;
		default:
			System.out.println("Error check your input");
			break;
		}
	}

}

class college {
	public void m1() {
		/*
		 * System.out.println("enter your domain"); System.out.println("1.ug");
		 * System.out.println("2.pg");
		 */
		// System.out.println("college code" + " : "+"552552");
	}

}

class ug extends college {
	public void ug() {

		System.out.println("enter your courese");
		System.out.println("1.btech");
		System.out.println("2.degree");
		System.out.println("3.want change domin(pg)");
	}

	public void m1() {

		System.out.println("availble branches(ENTER THE VALUE FOR MORE DETAILS");
		System.out.println("1.CSE");
		System.out.println("2.EEE");
		System.out.println("3.ECE");
		System.out.println("4.CIVIL");
		System.out.println("5.MECH");

		Scanner scan3 = new Scanner(System.in);
		int k = scan3.nextInt();
		if (k >= 1 || k <= 5) {
			System.out.println(
					"FOR MANAGEMENT SEAT  " + " YEARLY FEE = 45000" + "FOR FOUR YEARS=1,10,000 (SINGLE PAYMENT)");
			System.out.println("for convenor seats  " + " " + "  REMBRISMENT=38000 " + "  SCHOLORSHIP=4500 ");
			System.out.println("ANY QUERIERS PLEASE CONTACT TO THIS NUMBER ***********");
		}

		System.out.println("1.want to check another branches");
		System.out.println("1.yes ");
		System.out.println("2. no");

	}

	public void m() {

		System.out.println("availble coruses(ENTER THE VALUE FOR MORE DETAILS");
		System.out.println("1.BSC");
		System.out.println("2.BBA");
		System.out.println("3.MPCS");
		System.out.println("4.MPS");
		System.out.println("5.B.COM.CA");
		System.out.println("6.chnage to btech ");
		Scanner scan3 = new Scanner(System.in);
		int k = scan3.nextInt();
		if (k >= 1 || k <= 5) {
			System.out.println(
					"FOR MANAGEMENT SEAT  " + "  YEARLY FEE = 30000 " + " FOR THREE YEARS=80,000 (SINGLE PAYMENT)");
			System.out.println("for convenor seats  " + " " + "  REMBRISMENT=25000 " + "  SCHOLORSHIP=4500 ");
			System.out.println("ANY QUERIERS PLEASE CONTACT TO THIS NUMBER ***********");
		}
		System.out.println("1.want to check another branches");
		System.out.println("1.yes ");
		System.out.println("2. no");
	}

	public void m7() {
		System.out.println("want to check another courses");
		System.out.println("1.yes ");
		System.out.println("2. no");
	}

	public void m8() {
		System.out.println("tata bye bye ");

	}

	public void m9() {
		System.out.println("do you want exit ");
		System.out.println("1.yess");
		System.out.println("2.no");
	}
}

class pg extends college {
	public void pg() {
		Scanner scan1 = new Scanner(System.in);

		System.out.println("enter your courese");
		System.out.println("1.MCA");
		System.out.println("2.MBA");
		System.out.println("3.MTECH");

	}

	public void m2() {
		///// MCA//

		System.out.println("availble courses(ENTER THE VALUE FOR MORE DETAILS");
		System.out.println("1.DATA SCIENCE");
		System.out.println("2.COULD COMPUTING");
		System.out.println("3.DATA MANGAEMENT");
		Scanner scan3 = new Scanner(System.in);
		int k = scan3.nextInt();
		if (k >= 1 || k <= 3) {
			System.out.println(
					"FOR MANAGEMENT SEAT  " + " YEARLY FEE = 65000" + "FOR two YEARS=1,00,000 (SINGLE PAYMENT)");
			System.out.println("for convenor seats  " + " " + "  REMBRISMENT=58000 " + "  SCHOLORSHIP=11000 ");
			System.out.println("ANY QUERIERS PLEASE CONTACT TO THIS NUMBER ***********");
		}
		System.out.println("do want check another branches");
		System.out.println("1.yes ");
		System.out.println("2. no");

	}

	public void m3() // MBA
	{

		System.out.println("availble courses(ENTER THE VALUE FOR MORE DETAILS");
		System.out.println("1.HR");
		System.out.println("2.finacer");
		System.out.println("3.marketing");
		Scanner scan3 = new Scanner(System.in);
		int k = scan3.nextInt();
		if (k >= 1 || k <= 3) {
			System.out.println(
					"FOR MANAGEMENT SEAT  " + " YEARLY FEE = 120000" + "FOR two YEARS=210,000 (SINGLE PAYMENT)");
			System.out.println("for convenor seats  " + " " + "  REMBRISMENT=60000 " + "  SCHOLORSHIP=12500 ");
			System.out.println("ANY QUERIERS PLEASE CONTACT TO THIS NUMBER ***********");
		}
		System.out.println("do want check another branches");
		System.out.println("1.yes ");
		System.out.println("2. no");

	}

	public void m4()// MTECH
	{

		System.out.println("availble branches(ENTER THE VALUE FOR MORE DETAILS");
		System.out.println("1.AI");
		System.out.println("2.ROBOTICS");
		System.out.println("3.POWER ELECTRONIC");
		System.out.println("4.MACHINE LERANING");
		System.out.println("5.NETWORKS");
		Scanner scan3 = new Scanner(System.in);
		int k = scan3.nextInt();
		if (k >= 1 || k <= 5) {
			System.out.println(
					"FOR MANAGEMENT SEAT  " + " YEARLY FEE = 150000" + "FOR THREE YEARS=3,10,000 (SINGLE PAYMENT)");
			System.out.println("for convenor seats  " + " " + "  REMBRISMENT=110000 " + "  SCHOLORSHIP=12500 ");
			System.out.println("ANY QUERIERS PLEASE CONTACT TO THIS NUMBER ***********");
		}
		System.out.println("do want check another branchess");
		System.out.println("1.yes ");
		System.out.println("2. no");

	}

	public void m5() {
		System.out.println(" byeee tata see u");

	}

	public void m6() {
		System.out.println("do you want check another course");
		System.out.println("1.yes ");
		System.out.println("2. no");

	}

}
