package lab2_OOP;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		//Задача 1А
		/*int i = 1;
	    while (i <= n) {
	        int num = i;
	        int j = 1;

	        while (j <= n) {
	            System.out.print(num + " ");
	            num += 2;
	            j++;
	        }
	        System.out.println();
	        i++;
	    }*/
		//Задача 2А
		int i = 0;
	    while(i<=n) {
	    	int j = 1;	
	    	while(j<=i) {
	    		System.out.print(j + " ");
	    		j++;
	    		
	    	}
	    	System.out.println();
    		i++;
	    }
		//Задача 3А
		/*int i = n;
		do {
			int j = 1;
			do {
				System.out.print(j + " ");
	    		j++;
			}while(j<=i);
			System.out.println();
    		i--;
		}while(i!=0);*/
	    //Задача 4А
		/*int i = 1;
		do {
			int j = n;
			do {
				System.out.print(j + " ");
	    		j--;
			}while(j>=i);
			System.out.println();
    		i++;
		}while(i<=n);*/
		//Задача 1В
		/*int i = 1;
		while (i <= n) {
			int j = n - i;
			while (j > 0) {
				System.out.print("  ");
				j--;
			}
			j = 1;
			while (j <= i) {
				System.out.print(j + " ");
				j++;
			}
			j = i - 1;
			while (j > 0) {
				System.out.print(j + " ");
				j--;
			}
			System.out.println();
			i++;
		}
		i = n - 1;
		while (i > 0) {
			int j = n - i;
			while (j > 0) {
				System.out.print("  ");
				j--;
			}
			j = 1;
			while (j <= i) {
				System.out.print(j + " ");
				j++;
			}
			j = i - 1;
			while (j > 0) {
				System.out.print(j + " ");
				j--;
			}
			System.out.println();
			i--;
		}*/
											//DZ
		
		
		
		
		//Задача 1 while
		/*int i = 0;
	    while(i<=n) {
	    	int j = 1;
	    	if(i%2==0) {
	    		while(j<=i) {
	    			System.out.print(j + " ");
	    			j++;
	    		}	    		
	    	}
	    	else {
    			j = i;
    			while(j!=0) {
    	    		System.out.print(j+" ");
    	    		j--;
    	    		
    	    	}
    		}
	    	System.out.println();
    		++i;
	    }*/
		//Задача 1 do while
		/*int i = 1;
		do {
			int j = 1;
			if(i%2==0) {
				do {
					System.out.print(j + " ");
					j++;
				}while(j<=i);
			}
			else {
				j = i;
				do {
					System.out.print(j + " ");
	    			j--;
				}while(j!=0);	
			}
			System.out.println();
    		i++;
		}while(i<=n);*/
		//Задание 2
		//do while
		/*int i = 1;
		int j = n;
		int k;
		int m;
		do {
			j = n;
			k = 1;
			do {
				System.out.print("   ");
				k++;
			}while(k<=i);
			do {
				System.out.print(j + "  ");
	    		j--;
			}while(j>=i);
			System.out.println();
    		i++;
		}while(i<=n);
		i = n;
		do {
			j = n;
			k = 1;;
			do {
				System.out.print("   ");
				k++;
			}while(k<=i);
			do {
				System.out.print(j + "  ");
	    		j--;
			}while(j>=i);
			System.out.println();
    		i--;
		}while(i!=0);*/
		
		//WHILE
		/*int i = 1;
		int k;
		int j;
		while(i<=n) {
			j = n;
			k = 1;
			while(k<=i) {
				System.out.print("   ");
				k++;
			}
			while(j>=i) {
				System.out.print(j + "  ");
	    		j--;
			}
			System.out.println();
    		i++;
		}
		i = n;
		while(i!=0) {
			j = n;
			k = 1;
			while(k<=i) {
				System.out.print("   ");
				k++;
			}
			while(j>=i) {
				System.out.print(j + "  ");
	    		j--;
			}
			System.out.println();
    		i--;
		}*/
	}
}

