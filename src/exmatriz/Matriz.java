package exmatriz;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		System.out.println("entre com a quantidade de linhas: ");
		int m = sc.nextInt();
		System.out.println("entre com a quantidade de colunas: ");
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		System.out.println("coloque todos os valores da matriz: ");
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Entre com o valor que deseja: ");
		int x = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

	}


