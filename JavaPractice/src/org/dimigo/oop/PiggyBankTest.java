/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *  |_ PiggyBankTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 16.
 * </pre>
 * 
 * @author	: primeheader
 * @version	: 1.0
 */

public class PiggyBankTest {
	public static void main(String[] args) {
		FamilyMember mem1 = new FamilyMember("아빠");
		FamilyMember mem2 = new FamilyMember("엄마");
		FamilyMember mem3 = new FamilyMember("나");
		FamilyMember mem4 = new FamilyMember("남동생");
		
		FamilyMember.printMemberCnt();
		
		PiggyBank.putMoney(mem1, 10000);
		PiggyBank.putMoney(mem2, 5000);
		PiggyBank.putMoney(mem3, 2000);
		PiggyBank.putMoney(mem4, 1000);
		
		PiggyBank.printBalance();
		
		PiggyBank.putMoney(mem3, 1000);
		
		PiggyBank.steelMoney(mem4, 10000);
		
		PiggyBank.printBalance();
	}
}
