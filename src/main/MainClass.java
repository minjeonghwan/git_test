package main;

import java.util.Scanner;

public class MainClass { 
	public static void main(String[] args) {
		//kim -로그인 관련 기능 만드세요
		//cho - 회원 관리 기능을 만드세요
		System.out.println("main인 시작");
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1.로그인 2.회원관리");
			num=sc.nextInt();
			switch(num) {
			case 1:
				break;
			case 2:
				break;
			}
		}
	}
}
