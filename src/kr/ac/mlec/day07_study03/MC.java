package kr.ac.mlec.day07_study03;

import java.util.Arrays;

public class MC {
	private Machine machine;
	private int[] lottoNumber;

	public MC() {
		machine = new Machine();
		lottoNumber = new int[6];
	}

	public void ment() {
		System.out.println("lotto 777");
		machine.shuffle();
		for (int i = 0; i < 6; i++) {
			lottoNumber[i] = machine.getBall(i).getNumber();
		}
		System.out.println("lotto result :" + Arrays.toString(lottoNumber));
	}
}
