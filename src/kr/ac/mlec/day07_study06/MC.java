package kr.ac.mlec.day07_study06;

public class MC {
	private Machine machine;
	private int[] lottoNumber;

	public MC() {
		machine = new Machine();
		lottoNumber = new int[6];
	}

	public void ment() {
		System.out.println("lotto 추첨합니다!!!");
		machine.shuffle();
		for (int i = 0; i < lottoNumber.length; i++) {
			lottoNumber[i] = machine.getBall(i).getNumber();
			System.out.println(i + 1 + "번째 추첨번호는 " + lottoNumber[i] + "입니다.");
		}
	}
}
