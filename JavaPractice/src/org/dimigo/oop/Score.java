/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ Score
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 13.
 * </pre>
 *
 * @author		: 심민규
 * @version		: 1.0
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어점수 입력:");
		int kor = scanner.nextInt();
		System.out.println("수학점수 입력:");
		int math = scanner.nextInt();
		System.out.println("영어점수 입력:");
		int eng = scanner.nextInt();
		
		String print = new StringBuilder()
							.append("<<점수출력>>\n")
							.append("국어점수:" + (kor) + " 점\n")
							.append("수학점수:" + (math) + " 점\n")
							.append("영어점수:" + (eng) + " 점\n")
							.append("총점:" + (kor + math + eng) + " 점\n")
							.append("평균:" + String.format("%.1f", (kor + math + eng)/3.0) + " 점")
							.toString();
		
		System.out.println(print);
		scanner.close();
	}
}
