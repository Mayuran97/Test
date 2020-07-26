package Home_java_projects;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		while (true) {
			float r, area;

			Scanner scan = new Scanner(System.in);

			System.out.print("\nEnter the Radius : ");
			r = scan.nextFloat();

			area = (float) (22.0 / 7) * r * r;

			System.out.print("\nArea of circle is " + area);
		}
	}
}
