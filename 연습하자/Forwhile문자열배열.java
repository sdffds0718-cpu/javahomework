package 연습하자;

import java.util.Scanner;

public class Forwhile문자열배열 {

	public static void main(String[] args) {
		// 1부터 100까지의 합을 while문으로 구하는 코드를 짜시오
		
		/*int i = 1;
		int sum = 0;
		while (i<=100) {
			sum+=i;
			i++;
		
		}
		System.out.println(sum);*/
//5단 부터 7단까지 구구단을 출력하는 코드를 짜시오
		
		/*for (int i=5; i<= 7; i++) {
			System.out.println( "-----"+i + "단 -----");
				
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" +( i * j) );
				
			}
	
				
		}*/
		//주사위를 굴리다가 6이나오면 멈추는코드
		
	/*while(true) {
		int num = (int)(Math.random()*6)+1;
		System.out.println(num);
		if(num==6) {
			break;
		}
		System.out.println(num);
		}
	
	for (int i = 1; i<= 10; i++) {
		System.out.print(i);
	}
		int sum= 0;
	for(int i = 1; i <= 100; i++) {
		sum+=i;
		System.out.println(sum);
		
	}*/
	
	/*int i = 1;

	while (i <= 10) {
		
		
		if ( i % 2 != 0) {
			i++;
			continue;
		
		}
		System.out.println(i);
		i++;
		
	}*/
	/*int i =(int)(Math.random()*6)+1;
	while (true) {
		System.out.println(i);
		i++;
if (i==6)
	break;
	}
	System.out.println(i);
	*/
	/*int sum = 0;
		int [] arr = {10, 20 , 30 , 40 , 50};
		for (int i=0; i < arr.length; i++) {
			sum += arr [i];
			System.out.println(i);
		}*/
		/*Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		int i = 1;
		int sum = 0;
		while (i<= num) {
sum+=i;			
i++;
		}
		System.out.println(sum);
		*/
	
	/*Scanner sc = new Scanner(System.in);
	System.out.println("정수 a를입력하세요");
	int a = sc.nextInt();
	System.out.println("정수 b를 입력하세요");
	int b = sc.nextInt();
	
	for(int i =a; i <= b; i++) {
		System.out.println("------" + i + "단------");
		for(int j = 1; j <= 9; j++) {
			System.out.println(i + "X" + j + "=" + (i * j));
	}
	}*/	
		
	
	/*	int [] arr = {10, 20,30,40,50};
		for (int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		
		/*int [] arr = {10,20,30,40,50};
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
	
		System.out.println(sum);*/
		
	/*	int sum=0;
		int [] arr = {10,20,30,40,50};
		for (int i = 0; i< arr.length; i++) {
			sum+=  arr[i];
		}
		double a =(double)(sum) / arr.length;
		System.out.println(sum);
	*/
	/*
	int [] arr = { 1 , 2, 3, 4, 5};
	for(int i = arr.length -1; i>=0; i--) {
		System.out.println(arr[i]);*/
		
		/*
		String str = "자바 프로그래밍";
		System.out.println(str.length());
		*/
	
/*	String str = "hello jave";
	char ch = str.charAt(2);
	System.out.println(str.charAt(2));
	*/
		
		/*String str = "Hello Java";
		System.out.println(str.substring(6));
	*/
		/*String str = "나는 자바를 좋아한다";
		System.out.println(str.replace("자바", "파이썬"));
	*/
		String str = "I love Jave";
		String [] arr = str.split(" ");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	
	
	
	}
	}
	
	
	
	


