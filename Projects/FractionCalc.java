import java.util.*;

public class FractionCalc {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = "";
		String operator;
		while (!str.equals("quit")) {
			System.out.println("Enter an equation or type \"quit\"");
			str = s.nextLine();
			operator = charDetector(str);
			if (str.equals("quit")) {
				break;
			}
			if(str.contains(" / ")) {
				str = str.replace(" / ", " | ");
			}
			if(operator.equals("/")) {
				operator = "|";
			}
			int[][] breakdown = numberbreak(str, operator);
			if (operator.equals("+")) {
				System.out.println(add(breakdown));
			} else if (operator.equals("-")) {
				System.out.println(subtract(breakdown));
			} else if (operator.equals("*")) {
				System.out.println(multiply(breakdown));
			} else if (operator.equals("|")) {
				System.out.println(divide(breakdown));
			} else {
				System.out.println("Invalid operator");
			}
			System.out.println(Arrays.deepToString(breakdown));
		}
	}

	public static String charDetector(String str) { // detecting if the operator
		if (str.indexOf('+') > 0) {
			return "+";
		}
		if (str.indexOf(" / ") > 0) {
			return "/";
		}
		if (str.indexOf('*') > 0) {
			return "*";
		}
		if (str.indexOf(" - ") > 0) {
			return "-";
		}
		return "0";
	}

	public static String add(int[][] a) {
		if (a[0][0] < 0) {
			a[0][1] *= -1;
		}
		if (a[1][0] < 0) {
			a[1][1] *= -1;
		}
		int total = a[0][1] * a[1][2];
		total += a[1][1] * a[0][2];
		int count = a[0][0] + a[1][0];
		int totalDenom = a[0][2] * a[1][2];
		if(total<0) {
			
		}
		int GCD = findGCD(total, totalDenom);
		if (GCD > 0) {
			total /= GCD;
			totalDenom /= GCD;
		}
		if (totalDenom > 0) {
			count += total / totalDenom;
			total = total % totalDenom;
		}
		if (count != 0 && total != 0 && totalDenom != 0) {
			if(count < 0 && total < 0) {
				total *= -1;
			}
			return count + " " + total + "/" + totalDenom;
		} else if (total == 0 || totalDenom == 0) {
			return count + "";
		} else {
			return total + "/" + totalDenom;
		}
	}

	public static String subtract(int[][] a) { // formula: a/b - c/d = ad-bc/bd
		if (a[0][0] < 0) {
			a[0][1] *= -1;
		}
		if (a[1][0] < 0) {
			a[1][1] *= -1;
		}
		int count = 0;
		int nom1 = a[1][2] *(a[0][0] * a[0][2] + a[0][1]);
		int nom2 = a[0][2] * (a[1][0] * a[1][2] + a[1][1]);
		int total = nom1 - nom2;
		int totalDenom = a[0][2] * a[1][2];
		int GCD = findGCD(total, totalDenom);
		if (GCD > 0) {
			total /= GCD;
			totalDenom /= GCD;
		}
		if (totalDenom > 0) {
			count += total / totalDenom;
			total = total % totalDenom;
		}
		if (count != 0 && total != 0 && totalDenom != 0) {
			if(count < 0 && total < 0) {
				total *= -1;
			}
			return count + " " + total + "/" + totalDenom;
		} else if (total == 0 || totalDenom == 0) {
			return count + "";
		} else {
			return total + "/" + totalDenom;
		}
	}

	public static String multiply(int[][] a) {
		if (a[0][0] < 0) {
			a[0][1] *= -1;
		}
		if (a[1][0] < 0) {
			a[1][1] *= -1;
		}
		if (a[0][2] < 0) {
			a[0][2] *= -1;
			a[1][1] *= -1;
		}
		if (a[1][2] < 0) {
			a[1][2] *= -1;
			a[0][1] *= -1;
		}
		if(a[0][2] == 0) {
			a[0][2] = 1;
		}
		if(a[1][2] == 0) {
			a[1][2] = 1;
		}
		if(a[0][0] != 0) {
			a[0][1] += a[0][0]*a[0][2];
			a[0][0] = 0;
		}
		if(a[1][0] != 0) {
			a[1][1] += a[1][0]*a[1][2];
			a[1][0] = 0;
		}
		int count = a[0][0] * a[1][0];
		int total = a[0][1]*a[1][1];
		int totalDenom = a[0][2]*a[1][2];
		int GCD = findGCD(total, totalDenom);
		if (GCD > 0) {
			total /= GCD;
			totalDenom /= GCD;
		}
		if (totalDenom > 0) {
			count += total / totalDenom;
			total = total % totalDenom;
		}
		if (count != 0 && total != 0 && totalDenom != 0) {
			if(count < 0 && total < 0) {
				total *= -1;
			}
			return count + " " + total + "/" + totalDenom;
		} else if (total == 0 || totalDenom == 0) {
			return count + "";
		} else {
			return total + "/" + totalDenom;
		}
	}

	public static String divide(int[][] a) { //credit from calculatorsoup.com/calculators/math/fractions.php
		int count = 0;
		if (a[0][0] < 0) {
			a[0][1] *= -1;
		}
		if (a[1][0] < 0) {
			a[1][1] *= -1;
		}
		if(a[0][2] == 0) {
			a[0][2] = 1;
		}
		if(a[1][2] == 0) {
			a[1][2] = 1;
		}
		if(a[0][0] != 0) {
			a[0][1] += a[0][0]*a[0][2];
			a[0][0] = 0;
		}
		if(a[1][0] != 0) {
			a[1][1] += a[1][0]*a[1][2];
			a[1][0] = 0;
		}
		int tempnum = a[1][1];
		a[1][1] = a[1][2];
		a[1][2] = tempnum;
		int total = a[1][1] * a[0][1];
		int totalDenom = a[0][2] * a[1][2];
		if(totalDenom < 0) {
			totalDenom *= -1;
			total *= -1;
		}
		int GCD = findGCD(total, totalDenom);
		if (GCD > 0) {
			total /= GCD;
			totalDenom /= GCD;
		}
		if (totalDenom > 0) {
			count += total / totalDenom;
			total = total % totalDenom;
		}
		if (count != 0 && total != 0 && totalDenom != 0) {
			if(count < 0 && total < 0) {
				total *= -1;
			}
			return count + " " + total + "/" + totalDenom;
		} else if (total == 0 || totalDenom == 0) {
			return count + "";
		} else {
			return total + "/" + totalDenom;
		}

	}

	public static int[][] numberbreak(String str, String operator) { // break down the numerators and denominators
		String str1 = str.substring(0, str.indexOf(operator) - 1);
		String str2 = str.substring(str.indexOf(operator) + 2, str.length());
		int[][] a = new int[2][3];
		if (!str1.contains("/")) {
			a[0][0] = Integer.parseInt(str1);
		} else if (str1.contains("_")) {
			a[0][0] = Integer.parseInt(str1.substring(0, str1.indexOf('_')));
			a[0][1] = Integer.parseInt(str1.substring(str1.indexOf('_') + 1, str1.indexOf('/')));
			a[0][2] = Integer.parseInt(str1.substring(str1.indexOf('/') + 1, str1.length()));
		} else {
			a[0][1] = Integer.parseInt(str1.substring(0, str1.indexOf('/')));
			a[0][2] = Integer.parseInt(str1.substring(str1.indexOf('/') + 1, str1.length()));
		}
		if (!str2.contains("/")) {
			a[1][0] = Integer.parseInt(str2);
		} else if (str2.contains("_")) {
			a[1][0] = Integer.parseInt(str2.substring(0, str2.indexOf('_')));
			a[1][1] = Integer.parseInt(str2.substring(str2.indexOf('_') + 1, str2.indexOf('/')));
			a[1][2] = Integer.parseInt(str2.substring(str2.indexOf('/') + 1, str2.length()));
		} else {
			a[1][1] = Integer.parseInt(str2.substring(0, str2.indexOf('/')));
			a[1][2] = Integer.parseInt(str2.substring(str2.indexOf('/') + 1, str2.length()));
		}
		return a;
	}

	public static int findGCD(int num1, int num2) {
		if(num1 < 0) {
			num1 *= -1;
		}
		if(num2 < 0) {
			num2 *= -1;
		}
		if (num2 == 0) {
			return num1;
		}
		return findGCD(num2, num1 % num2);
	}

}
