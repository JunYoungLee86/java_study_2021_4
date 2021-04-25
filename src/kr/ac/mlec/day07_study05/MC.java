package kr.ac.mlec.day07_study05;

import java.util.Arrays;

public class MC {
	private Machine machine;
	private int[] lottoNumber;

	public MC() {
		machine = new Machine();
		lottoNumber = new int[6];
	}

	public void ment() {
		System.out.println("lotto 추첨을 시작합니다.!");
		machine.shuffle();
		for (int i = 0; i < lottoNumber.length; i++) {
			lottoNumber[i] = machine.getBall(i).getNumber();
		}
		System.out.println("lotto 결과는 " + Arrays.toString(lottoNumber) + "입니다.");
	}
}
