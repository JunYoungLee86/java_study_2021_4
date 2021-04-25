package kr.ac.mlec.day07_study;

import java.util.Random;

public class Machine {
	private Ball[] balls;

	public Machine() {
		balls = new Ball[45];
		for (int i = 0; i < 45; i++) {
			balls[i] = new Ball(i + 1);
//			System.out.println(balls[i].getNumber());
		}
	}

	public void shuffle() {
		System.out.println("셔플");
		Random r = new Random();

		for (int i = 0; i < 45; i++) {
			int randomIndex = r.nextInt(45 - i) + i;
			Ball temp = balls[i];
			balls[i] = balls[randomIndex];
			balls[randomIndex] = temp;
		}
	}

	public Ball getBall(int idx) {
		return balls[idx];
	}

}
