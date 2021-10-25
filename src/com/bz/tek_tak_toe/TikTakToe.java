package com.bz.tek_tak_toe;

public class TikTakToe {
	char[] board = new char[10];

	public void CreateBoard() {

		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
	}

	public static void main(String[] args) {
		System.out.println("Wel Come to Tik_Tak_Toe");
		TikTakToe obj = new TikTakToe();
		obj.CreateBoard();
	}

}
