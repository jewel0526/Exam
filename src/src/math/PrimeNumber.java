package src.math;


import java.math.BigInteger;
public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */


				BigInteger sum = new BigInteger("2");

				//for (int i=3; i<1000000; i++) {
				for(int i=3; i<10; i++){
					for (int j=2; j<i; j++){
						if (i % j == 0)
							break;
						else if (i == j+1){
							sum = sum.add(BigInteger.valueOf(i));
						}
					}
				}
				System.out.println("Sum  = "+sum);
			}
		}






