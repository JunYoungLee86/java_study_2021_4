package kr.ac.mlec.day07_study07;

import java.util.Arrays;

public class MC {
	private Machine machine;
	private int[] lottoNum;

	public MC() {
		machine = new Machine();
		lottoNum = new int[6];
	}

	public void ment() {
		System.out.println("lotto 추첨을 실행합니다.!");
		machine.shuffle();
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = machine.getBall(i).getNumber();
		}
		System.out.println("result : " + Arrays.toString(lottoNum) + "입니다!!!!!!~~");
	}
}
