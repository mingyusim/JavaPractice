/**
 * <pre>
 * org.dimigo.thread
 *   |_ Runner
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
public class Runner2 implements Runnable{
	String name;
	
	public Runner2() {}
	
	public Runner2(String name) {
		this.name = name;
	}
	
	public void run() {
		System.out.println(name + " 출발");
		 
		int i;
		
		for(i=100; i>=0; i-=10) {
			System.out.println(name + " " + i + " 미터");
			
			try {
					Thread.sleep(1000);
			} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(i == 0) {
				System.out.println(name + " 골인");
			}
		}
	}
}
