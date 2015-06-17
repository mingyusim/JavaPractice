/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ PiggyBank
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 16.
 * </pre>
 *
 * @author		: 심민규
 * @version		: 1.0
 */
public class PiggyBank {
	public static int balance;
	
	public static void putMoney(FamilyMember member, int amount) {
		System.out.println(member.getMemberName() + "\t" + amount + "\t(원) 입금함");
		balance += amount;
	}
	
	public static void stealMoney(FamilyMember member, int amount) {
		if(amount > balance) {
			System.out.println("돈이없어요..");
		} else {
			System.out.println(member.getMemberName() + "\t" + amount + "\t(원) 출금함");
			balance -= amount;
		}
	}
	
	public void printBalance() {
		System.out.println("돼지저금통 총 금액 : " + balance + "원");
	}
	
	
}
