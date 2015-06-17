/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ PiggyBankTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 16.
 * </pre>
 *
 * @author		: 심민규
 * @version		: 1.0
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FamilyMember father = new FamilyMember("아빠");
		FamilyMember mother = new FamilyMember("엄마");
		FamilyMember I = new FamilyMember("나");
		FamilyMember brother = new FamilyMember("남동생");
		
		FamilyMember.printMemberCnt();
		System.out.println("=============================");
		
		PiggyBank bank = new PiggyBank();
		
		PiggyBank.putMoney(father, 10000);
		PiggyBank.putMoney(mother, 5000);
		PiggyBank.putMoney(I, 2000);
		PiggyBank.putMoney(brother, 1000);
		
		System.out.println("----------------------------");
		bank.printBalance();
		System.out.println("\n============================"); 
		
		PiggyBank.putMoney(I, 1000);
		PiggyBank.stealMoney(brother, 2000);
		PiggyBank.stealMoney(I, 2000);
		PiggyBank.putMoney(brother, 10000);
		PiggyBank.stealMoney(mother, 5000);
		System.out.println("----------------------------");
		bank.printBalance();
		
		System.out.println();
		PiggyBank.stealMoney(brother, 25000);
	}

}
