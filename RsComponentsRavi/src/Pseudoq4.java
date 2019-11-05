
import java.util.Scanner;

public class Pseudoq4 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int num = 0;

		Math math1 = new Math(num);

		while (num >= 0) {

			num = kb.nextInt();

			if (num >= 0) {

				math1.adder(num);

				System.out.println("Total till now:" + math1.getNumTotal());
			}
		}

		System.out.println("Exiting since user entered negative input , Total is:::" + math1.getNumTotal());

		kb.close();

	}

}

class Math {

	private int numTotal;

	private int num;

	public Math(int num) {

		this.num = num;

	}

	public int getNum() {

		return this.num;
	}

	public int getNumTotal() {

		return this.numTotal;

	}

	public void setNumTotal(int value) {

		this.numTotal = value;

	}

	public void setNum(int value) {

		this.num = value;
	}

	public void adder(int num) {

		this.num = num;

		numTotal = numTotal + this.num;
	}

}
