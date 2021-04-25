package kr.ac.mlec.day07_study;

import java.util.Arrays;

public class MC {
	private Machine machine;
	private int[] lottoNumber;

	public MC() {
		machine = new Machine();
		lottoNumber = new int[6];
	}

	public void ment() {
		System.out.println("로또 추첨을 시작합니다.");
		machine.shuffle();
		for (int i = 0; i < 6; i++) {
			lottoNumber[i] = machine.getBall(i).getNumber();
		}
		System.out.println(Arrays.toString(lottoNumber));
	}
}
