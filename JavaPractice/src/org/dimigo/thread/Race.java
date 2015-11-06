/**
 * <pre>
 * org.dimigo.thread
 *   |_ Race
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 11. 6.
 * </pre>
 *
 * @author		: 심민규
 * @version		: 1.0
 */
package org.dimigo.thread;

/**
 * @author master
 *
 */
public class Race {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread start");
		
		Thread t1 = new Runner("홍길동");
		Thread t2 = new Runner("홍길순");
		
		// MAX_PRIORITY(10), NORM_PRIORITY(5), MIN_PRIORITY
		// 우선순위가 높은 스레드가 실행 기회를 더 많이 가진다.
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		// multi thread로 실행하려면 start() 호출하기
		t1.start();
		t2.start(); 
		
		System.out.println("main thread stop");
	}

}
