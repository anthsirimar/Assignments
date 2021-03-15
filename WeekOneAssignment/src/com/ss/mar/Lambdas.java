package com.ss.mar;

public class Lambdas {

	public PerformOperation isOdd() {
		return n -> n % 2 == 1;
	}

	public PerformOperation isPrime() {
		return (n) -> {
			for (int i = 2; i < n; i++) {
				if (n % i == 0)
					return false;
			}
			return true;
		};
	}

	public PerformOperation isPalindrome() {
		return (n) -> {
			int nReverse = 0;
			int nOriginal = n;
			int remainder = 0;

			while (nOriginal > 0) {
				remainder = nOriginal % 10;
				nReverse = (nReverse * 10) + remainder;
				nOriginal /= 10;
			}
			return nReverse == n;
		};
	}

}
