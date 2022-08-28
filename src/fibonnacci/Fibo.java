package fibonnacci;

import java.util.*;

public class Fibo {

	public static void main(String[] args) {

		System.out.println("Donner un nombre: ");

		try (Scanner sc = new Scanner(System.in)) {

			int N = sc.nextInt();
			List<Integer> entierList = new ArrayList<Integer>();
			entierList = getFibonacciNumberAt(N);

			System.out.print(entierList);

		}
	}

	/**
	 * 
	 * @param n : l'entier dont on veut calculer sa suite fibonnacci
	 * @return entierList : une liste d'entier
	 */
	public static List<Integer> getFibonacciNumberAt(int n) {

		List<Integer> entierList = new ArrayList<Integer>();
		List<Integer> entierList1 = new ArrayList<Integer>();
		List<Integer> entierList2 = new ArrayList<Integer>();

		if (n == 0 || n == 1) {
			entierList.add(n);
			return entierList;
		} else {
			for (int i : getFibonacciNumberAt(n - 1)) {
				entierList1.add(i);
			}
			for (int i : getFibonacciNumberAt(n - 2)) {
				entierList2.add(i);
			}

			entierList1.addAll(entierList2);

			return entierList1;

		}
	}

}
