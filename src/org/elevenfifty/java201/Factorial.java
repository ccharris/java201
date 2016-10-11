package org.elevenfifty.java201;

public class Factorial {

	public static void main(String[] args) {
		
		char[][] tictactoe = new char[][]{{'x', 'o', 'x'}, {'o', 'x', 'o'}, {'o', 'x' ,'x'}};
		for(int i = 0; i <tictactoe.length; i++){
			char [] row = tictactoe[i];
			for(int j = 0; j < row.length; j++){
				char x = row[j];
				System.out.print(x);
				System.out.print(' ');
			}
			System.out.println();
		}
//		
//		int num = Integer.valueOf(args[0]);
//		
//		int counter = 1;
//		long total = 1;
//		while (counter <= num){
//			total *= counter;
//			counter++;
//			System.out.println(total);
//		}
//		long newTotal = 1;
//		for (int i = 1; i <= num; i++){
//			newTotal *= i;
//			System.out.println(newTotal);
//		}
		Factorial calcOne = new Factorial();
		int num = Integer.valueOf(args[0]);
		calcOne.calculateFactorial(num);
		System.out.println(calcOne.totalFizzBuzzNumber());
		calcOne.fibSequence();
		calcOne.printFibonacci50();
	}

		public long calculateFactorial(int number){
			long total = 1;
			for (int i = 1; i <= number; i++){
				total *= i;
			}
			System.out.println(total);
			return total;
		}
		
		public int totalFizzBuzzNumber(){
			int total = 0;
			for (int i = 0; i <= 1000; i++){
				if(i % 3 == 0 || i % 5 == 0){
					total += i;
				} 
			}
			return total;
		}
		
		public void fibSequence() {
			int counter = 0;
			long number = 1;
			long prevNumber = 0;
			System.out.println(prevNumber);
			System.out.println(number);
			while( counter < 48){
					long oldNumber = number;
					number += prevNumber;
					prevNumber = oldNumber;
					System.out.println(number);
					counter++;
					}
				}
		public void printFibonacci50() {
			long first = 0;
			System.out.println(first);
			long second = 1;
			System.out.println(second);
			for(int i = 3; i <=50; i++){
				long next = first + second;
				System.out.println(next);
				first = second;
				second = next;
			}
		}
}
			
			



