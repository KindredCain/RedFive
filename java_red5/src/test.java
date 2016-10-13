import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

import red.*;

public class test {
	public static void main(String[] args){
		System.out.println("主牌花色:1)黑桃; 2)红桃; 3)草花; 4)方块;");
		Scanner in = new Scanner(System.in);
		int x;
		x = in.nextInt();
		Take a = new Take(x-1);
		SortedMap<Integer,String> people1 = new TreeMap<Integer,String>(a.getPeople1());
		SortedMap<Integer,String> people2 = new TreeMap<Integer,String>(a.getPeople2());
		SortedMap<Integer,String> people3 = new TreeMap<Integer,String>(a.getPeople3());
		SortedMap<Integer,String> people4 = new TreeMap<Integer,String>(a.getPeople4());
		Player[] player = new Player[4];
		player[0]=new Player(people1);
		player[1]=new Player(people2);
		player[2]=new Player(people3);
		player[3]=new Player(people4);
		for(int i=0;i<4;i++){
			System.out.print("玩家"+(i+1)+":");
			for(int j=0;j<25;j++)
				System.out.print("("+(j+1)+":"+player[i].getCard()[j].getName()+") ");
			System.out.println();
		}
		Game game = new Game(player);
		game.star();
	}
}
