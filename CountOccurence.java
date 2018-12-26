

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Scanner;


	public class CountOccurence {
		
		
			/*
			 * Write a program that reads an unspecified number of integers and 
			 * finds the one that has the most occurrences. 
			 * The input ends when the input is 0. 
			 * For example, if you entered 2 3 40 3 5 4 –3 3 3 2 0, the number 3 occurred most often. 
			 * If not one but several numbers have the most occurrences, all of them should be reported. 
			 * For example, since 9 and 3 appear twice in the list 9 30 3 9 3 2 4, both occurrences should 
			 * be reported.
			 * */
			
			public static void main(String[] args) {

				ArrayList<Integer> list = new ArrayList<Integer>();

				Scanner input = new Scanner(System.in);

				int number=1;

				

				System.out.println("Enter number:");

				while(number != 0) {

					number = input.nextInt();

					list.add(number);

				}

				input.close();



				int max = findMaxOccur(list);

				printMaxOccurNumber (list, max);

			}

			

			public static int findMaxOccur(ArrayList<Integer> list) {

				int max=0;

				for (int element : list) {

					if (Collections.frequency(list, element) > max) {

						max = Collections.frequency(list, element);

					}

				}

				return max;

			}



			public static void printMaxOccurNumber (ArrayList<Integer> list, int max) {

				ArrayList<Integer> maxNumberList = new ArrayList<Integer>();

			

				for (int element : list) {

					if (Collections.frequency(list, element) == max) {

						if (maxNumberList.contains(element) != true) {

							maxNumberList.add(element);

						}

					}

				}

				System.out.println(maxNumberList);

			}

			

		

	}

