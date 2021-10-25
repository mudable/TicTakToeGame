package com.bz.tek_tak_toe;

import java.util.Scanner;

public class TikTakToe {
	static char userChoice;
	static char computerChoice;
	char[] board = new char[10];
	Scanner sc = new Scanner(System.in);

	public void createBoard() {

		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
	}

	public void chooseLetter() {
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
			chooseLetter();
		}

	}

	public void showBoard() {
		System.out.println("-------");
		System.out.println("|" + board[1] + "|" + board[2] + "|" + board[3] + "|");
		System.out.println("-------");
		System.out.println("|" + board[4] + "|" + board[5] + "|" + board[6] + "|");
		System.out.println("-------");
		System.out.println("|" + board[7] + "|" + board[8] + "|" + board[9] + "|");
		System.out.println("-------");

	}

	public static void main(String[] args) {
		System.out.println("Wel Come to Tik_Tak_Toe");
		TikTakToe obj = new TikTakToe();
		obj.createBoard();
		obj.chooseLetter();
		obj.showBoard();
	}

}
