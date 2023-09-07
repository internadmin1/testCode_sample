package intern;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		
		System.out.println("入力した整数を2乗するプログラムです");
		
		// キーボード入力の準備
		Scanner stdin = new Scanner(System.in);
		
		// 無限ループ
		while(true) {
			
			System.out.println("整数を入力してください");
			System.out.print("整数：");

			// 入力されたデータが整数かどうかのチェック
			if(stdin.hasNextInt()) {
				
				// 入力されたデータを整数として読み込む
				int inputNum = stdin.nextInt();
				int result = inputNum * inputNum;
				
				System.out.println(inputNum + "の2乗は" + result);
				
				break;
				
			}else {
				// 整数以外の場合、無効なデータなのでやり直し
				System.out.println("【エラー】入力できるのは整数だけです");
				// 不要なトークンをバッファから取り除く
				stdin.next();
			}
		}
		
	}
}
