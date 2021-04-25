package kr.ac.mlec.day07_study06;

import java.util.Random;

public class Machine {
	private Ball[] balls;

	public Machine() {
		balls = new Ball[45];
		for (int i = 0; i < 45; i++) {
			balls[i] = new Ball(i + 1);
		}
	}

	public void shuffle() {
		Random r = new Random();
		for (int i = 0; i < 45; i++) {
			int randomNumber = r.nextInt(45 - i) + i;
			Ball temp = balls[i];
			balls[i] = balls[randomNumber];
			balls[randomNumber] = temp;
		}
	}

	public Ball getBall(int idx) {
		return balls[idx];
	}
}
