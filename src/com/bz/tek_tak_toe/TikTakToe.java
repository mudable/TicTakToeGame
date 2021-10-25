package com.bz.tek_tak_toe;

import java.util.Scanner;

public class TikTakToe {
	static char userChoice;
	static char computerChoice;
	char[] board = new char[10];
	Scanner sc = new Scanner(System.in);

	public void CreateBoard() {

		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
	}

	public void ChooseLetter() {
		System.out.println("Choose your point \n 1 for 'x' or choose 2 for 'o'");
		int option = sc.nextInt();

		switch (option) {

		case 1:
			userChoice = 'X';
			computerChoice = 'o';
			System.out.println("user choice is:" + userChoice + " computer choice is:" + computerChoice);
			break;
		case 2:
			userChoice = 'X';
			computerChoice = 'o';
			System.out.println("user choice is:" + userChoice + " computer choice is:" + computerChoice);
			break;
		default:
			System.out.println("invalid input");
			ChooseLetter();
		}

	}

	public static void main(String[] args) {
		System.out.println("Wel Come to Tik_Tak_Toe");
		TikTakToe obj = new TikTakToe();
		obj.CreateBoard();
		obj.ChooseLetter();
	}

}
