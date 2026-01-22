package oop;

public class CraneGameMachineTest {
	public static void main(String[] args) {
		CraneGameMachine cgm = new CraneGameMachine(false, 3);
		cgm.isInsertCoin = false;
		cgm.dolls = 10;

		cgm.insertCoin();
		int result = cgm.doGame();
		System.out.println("isInsertCoin: " + cgm.isInsertCoin);
		System.out.println("남은 인형개수: " + cgm.dolls);
		System.out.println("뽑은 인형개수: " + result);
		}
}
