package day18;

import java.util.ArrayList;
import java.util.Random;

public class Main2 {

	public static void main(String[] args) {
		//1.randomly draw 10 cards   
		ArrayList<Card> deck = new ArrayList<Card>();
		Random random = new Random();

		int x = random.nextInt();	//generate a big random number
		int y = random.nextInt(5);	//generate a number from 0~4, 0 ~ bound-1
		int z = random.nextInt(2,5);//generate a number from 2~4, origin ~ bound-1
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		for(int i=1 ; i<=10 ; i++) {//10 times
			Card c = new Card(random.nextInt(2, 15), 'S');
			System.out.println(c);
			deck.add(c);
		}
		
		
		//2.do valueCounts 
		ArrayList<Integer> list = valueCounts(deck);
		System.out.println(list);
	}
	
	static ArrayList<Integer> valueCounts(ArrayList<Card> deck) {
		//1.create a List, size is 15, full of 0
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1 ; i<=15 ; i++) {
			list.add(0);
		}
		//2.check the card in deck one by one
		//get the value of each card, take it as the index of list
		//change the count of that index, make it +1
		for(int i=0 ; i<deck.size() ; i++) {//purpose of this loop
			int index = deck.get(i).getValue();//index of list
			//get the original count of that index in this list
			int originalCount = list.get(index);
			//set the count of this index in list into originalCount+1
			originalCount+=1;
			
			//set which index into what value
			list.set(index, originalCount);
			
		}
		
		return list;
	}

}

class Card{
	private int value;
	private char face;
	public Card(int v,char f) {
		value = v;
		face = f;
	}
	
	public int getValue() {
		return value;
	}
	
	public char getFace() {
		return face;
	}
	
	public char getRank() {
		//2->2
		//3->3
		//.....
		//10->10
		//11->J
		//12->Q
		//13->K
		//14->A
		Object o;
		return 'A';
	}

	//generate->override: rewrite/replace
	@Override
	public String toString() {
		return "Card [value=" + value + ", face=" + face + "]";
	}
	
	
}












