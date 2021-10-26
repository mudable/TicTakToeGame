package com.bz.tek_tak_toe;

import java.util.Scanner;

public class TikTakToe {
	static char userChoice = 'x';
	static char computerChoice = 'o';
	char[] board = new char[10];
	Scanner sc = new Scanner(System.in);

	public void createBoard() {
		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
	}

	public void choice() {
		int turn = (int) (Math.random() * 10) % 2;
		if (turn == 0) {
			System.out.println("user play first");
		} else if (turn == 1) {
			System.out.println(" computer play first");
		}
	}

	public void computerChoice() {
		int computerTurn = (int) (Math.random() * 10) % 10;
		board[computerTurn] = computerChoice;
		System.out.println(" computer choice is:" + computerChoice);
	}

	public void userChoice() {
		System.out.println("enter user choice");
		String userChoice = sc.next();
		System.out.println("user choice is " + userChoice);
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

	public void checkFreeIndex() {
		System.out.println("choose index from 1 to 9  to make the move");
		int userInput = sc.nextInt();
		userChoice();
		showBoard();
		if (board[userInput] == 'x' | board[userInput] == 'o') {
			System.out.println("indext is not free");
		} else if (board[userInput] != 'x' | board[userInput] != 'o') {
			System.out.println("indext is free");
			board[userInput] = userChoice;
			showBoard();
		}
	}

	public static void main(String[] args) {
		System.out.println("Wel Come to Tik_Tak_Toe");
		TikTakToe obj = new TikTakToe();
		obj.createBoard();
		obj.choice();
		obj.computerChoice();
		obj.showBoard();
		obj.checkFreeIndex();
		
	}
}
