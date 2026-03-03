import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        double num = input.nextDouble();
        System.out.println(Math.abs(num));
	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        double num1 = input.nextDouble();
        System.out.print("Input another number: ");
        double num2 = input.nextDouble();
        double result = num1/num2;
        System.out.println(Math.floor(result) + "\n" + Math.ceil(result));
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        double num3 = input.nextDouble();
        System.out.println(Math.round(Math.sqrt(num3)));
	}

	public static void q4() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        double num4 = input.nextDouble();
        System.out.print("Input another number: ");
        double num5 = input.nextDouble();
        System.out.println(Math.pow(num4, num5));
	}

	public static void q5() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        double num6 = input.nextDouble();
        System.out.print("Input another number: ");
        double num7 = input.nextDouble();
        System.out.print("Input one more number: ");
        double num8 = input.nextDouble();
        double max = Math.max(Math.max(num6, num7), num8);
        double min = Math.min(Math.min(num6, num7), num8);
        System.out.println(max + "\n" + min);
	}

}

