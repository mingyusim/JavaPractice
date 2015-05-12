/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 12.
 * </pre>
 *
 * @author		: 심민규
 * @version		: 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가장 좋아하는 가수는?");
		String answer = scanner.nextLine();
		if(answer != null && answer.equals("빅뱅")) {
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! ㅠ");
		}
		
		System.out.println("가장 좋아하는 배우는?");
		answer = scanner.nextLine();
		if(answer != null && answer.equals("조인성")) {
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! ㅠ");
		}
		
		System.out.println("가장 좋아하는 과목은?");
		answer = scanner.nextLine();
		if(answer != null && answer.equals("자바")) {
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! ㅠ");
		}
		
	}
}
