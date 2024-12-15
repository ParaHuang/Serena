package day19;

import java.util.ArrayList;
import java.util.Random;

public class Main3 {

	public static void main(String[] args) {
		String[] types = {"♠","♥","♦","♣"};
		ArrayList<String> poker = new ArrayList<>();
//		go through every element in array
//			go throught number 1-13
		for(int i=0 ; i<types.length ; i++) {
//			types[i]
			for(int j=1 ; j<=13 ; j++) {
				if(j==1) {
					poker.add(types[i]+"A");
				}else if(j==11) {
					poker.add(types[i]+"J");
				}else if(j==12) {
					poker.add(types[i]+"Q");
				}else if(j==13) {
					poker.add(types[i]+"K");
				}else {
					poker.add(types[i]+j);
				}
			}
		}
		System.out.println(poker);

		ArrayList<String> player1 = new ArrayList<String>();
		ArrayList<String> player2 = new ArrayList<String>();
		ArrayList<String> player3 = new ArrayList<String>();
		
		Random random = new Random();
//		int x = random.nextInt();
//		int y = random.nextInt(5);	//0~4    5-1
//		int z = random.nextInt(2, 6);	//2~5			6-1
//
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
		System.out.println();
		for(int i=1 ; i<=7 ; i++) {
			//生成1张随机牌
			int index1 = random.nextInt(poker.size());
			//给player1	
			player1.add(poker.get(index1));
			//从原有牌堆中移除这张牌
			poker.remove(index1);
	
			//生成1张随机牌
			int index2 = random.nextInt(poker.size());
			//给player2
			player2.add(poker.get(index2));
			//从原有牌堆中移除这张牌
			poker.remove(index2);
	
			//生成1张随机牌
			int index3 = random.nextInt(poker.size());
			//给player3
			player3.add(poker.get(index3));
			//从原有牌堆中移除这张牌
			poker.remove(index3);
		}
		System.out.println("Player 1:"+player1);
		System.out.println("Player 2:"+player2);
		System.out.println("Player 3:"+player3);
		System.out.println();
		//player1 随机出牌
		int index1 = random.nextInt(player1.size());
		System.out.println("Player 1 just played:"+player1.remove(index1));
		System.out.println("Now he has "+player1+" left");

		int index2 = random.nextInt(player2.size());
		System.out.println("Player 2 just played:"+player2.remove(index2));
		System.out.println("Now he has "+player2+" left");

		int index3 = random.nextInt(player3.size());
		System.out.println("Player 3 just played:"+player3.remove(index3));
		System.out.println("Now he has "+player3+" left");		
		
	}

}


















