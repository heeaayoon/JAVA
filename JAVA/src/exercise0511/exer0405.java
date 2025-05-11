package exercise0511;

import java.util.Arrays;
import java.util.Random;

public class exer0405 {

	public static void main(String[] args) {
		//2���� �迭�� ��� ����
		
		
		//3*5�迭 A
		//A[3][5]�� 3���� �л��� 5���� ���� �� ����ǥ��� ��������.
		//������ 0~99 ������ ������ ���ڷ� ä���.
		Random rd = new Random();
		System.out.println("-----3*5�迭 A-------");
		int [][] arrA = new int [3][5];
		for (int i=0;i<arrA.length;i++) {
			for (int j=0;j<arrA[i].length;j++) {
				arrA[i][j]=rd.nextInt(100);
				System.out.print(arrA[i][j]+" ");
			} System.out.println();
		}	
		System.out.println();
		
		//3*5�迭 B�� ������ ������ ä���.
		System.out.println("-----3*5�迭 B-------");
		int [][] arrB = new int [3][5];
		for (int i=0;i<arrB.length;i++) {
			for (int j=0;j<arrB[i].length;j++) {
				arrB[i][j]=rd.nextInt(100);
				System.out.print(arrB[i][j]+" ");
			} System.out.println();
		}
		System.out.println();

		//C = A + B
		//A�� B�� �� �ڸ��� �ִ� ���� ���ؼ� C��� ���ο� ǥ�� �����.
		System.out.println("-----3*5�迭 C-------");
		int [][] arrC = new int[3][5];
		for (int i=0;i<arrC.length;i++) {
			for(int j=0;j<arrC[i].length;j++) {
				arrC[i][j]=arrA[i][j]+arrB[i][j];
				System.out.print(arrC[i][j]+" ");
			}System.out.println();
		}
		System.out.println();
		
		//5*4�迭 D�� ������ ������ ä���.
		System.out.println("-----5*4�迭 D-------");
		int [][] arrD = new int[5][4];
		for(int i=0;i<arrD.length;i++) {
			for(int j=0;j<arrD[i].length;j++) {
				arrD[i][j]=rd.nextInt(100);
				System.out.print(arrD[i][j]+" ");
			}System.out.println();
		}
		System.out.println();
		
		//E = A �� D (��� ����)
		//A(3x5) X D(5x4) -> E(3x4)
		System.out.println("-----3*4�迭 E-------");
		int [][] arrE = new int[3][4];
		for(int i=0;i<arrA.length;i++) {
			for(int j=0;j<arrD[0].length;j++) {
				for (int k=0;k<arrA[0].length;k++) {
					arrE[i][j]+=arrA[i][k]*arrD[k][j];
				}System.out.print(arrE[i][j]+" ");
			}System.out.println();
		}
		System.out.println();
		
		//F = D�� ��ġ ��� (Transpose)
		//��� ���� ��ġ�� �ٲ� ǥ�̴�.
		System.out.println("-----4*5�迭 F-------");
		int[][] arrF = new int[4][5];
		for (int i=0;i<arrF.length;i++) {
			for(int j=0;j<arrF[i].length;j++) {
				arrF[i][j] = arrD[j][i];
				System.out.print(arrF[i][j]+" ");
			}System.out.println();
		}
		System.out.println();

		
		//G = A �� D (A ���ϱ� F�� ��ġ ���)
		//A[3][5] �� F[4][5] �� ?? ������ �߸��� �� ����
		System.out.println("-----3*4�迭 G-------");
		int [][] arrG = new int[3][4];
		for(int i=0;i<arrA.length;i++) {
			for(int j=0;j<arrD[i].length;j++) {
				for(int k=0;k<arrA[i].length;k++) {
					arrG[i][j]+=arrA[i][k]*arrD[k][j];
				}System.out.print(arrG[i][j]+" ");
			}System.out.println();
		}
		System.out.println();
		
		//E�� G�� ������ ��
		//Arrays.deepEquals(E, G) �̿�
		if ( Arrays.deepEquals(arrE, arrG)==true) {
			System.out.println("arrE�� arrG�� �����մϴ�.");
		}else {
			System.out.println("arrE�� arrG�� �������� �ʽ��ϴ�.");
		}
		System.out.println();
		
		//2���� �迭�� ���̺� ���·� ���
		arr2Dprint(arrA);
	}
	
	static void arr2Dprint(int[][] array) {
		for (int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
