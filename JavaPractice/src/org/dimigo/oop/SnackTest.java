/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ SnackTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 19.
 * </pre>
 *
 * @author		: 심민규
 * @version		: 1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		
		Snack[] snackArr = {
			new Snack("새우깡", "농심", 1100, 2),
			new Snack("콘칲", "크라운", 1200, 1),
			new Snack("허니버터칩", "해태", 1500, 4)
		};
		
		for(Snack delicious : snackArr) {
			delicious.printSnack();
			System.out.println();
			i += delicious.calcPrice();
		}
		System.out.println("합계 : " + i + "원");
	}
}
