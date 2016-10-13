package red;

import java.util.Scanner;

public class Game {
	Player[] player = new Player[4];
	int flag,max,color;
	int flag_item,max_item;
	int item;
	int[] hash = new int[25];
	int num;
	Card[] card;
	Scanner in = new Scanner(System.in);
	public Game (Player[] player){
		this.player=player;
	}
	public void star (){
		flag=0;
		for(int i=0;i<25;i++){
			card = player[flag%4].getCard();
			System.out.println("玩家"+(flag%4+1)+"出牌");
			System.out.println("可出牌有:");
			for(int k=0;k<25-i;k++){
				System.out.print("("+(k+1)+":"+card[k].getName()+") ");
			}
			System.out.println();
			System.out.print("输入牌序号选择出牌:");
			num = in.nextInt();	
			max = card[num-1].num;
			color = max/1000;
			for(int k=num-1;k<24-i;k++){
				card[k]=card[k+1];
				player[flag%4].setCard(card);
			}
			for(int j=1;j<4;j++){
				item=0;
				if(color>3){
					card = player[(flag+j)%4].getCard();
					System.out.println("玩家"+((flag+j)%4+1)+"出牌");
					System.out.println("可出牌有:");
					for(int k=0;k<25-i;k++){
						if(card[k].getNum()/1000>3){
							System.out.print("("+(k+1)+":"+card[k].getName()+") ");
							hash[item]=k;
							item++;
						}
					}
					if(item==0){
						for(int k=0;k<25-i;k++){
							System.out.print("("+(k+1)+":"+card[k].getName()+") ");
							hash[item]=k;
							item++;
						}
					}
					System.out.println();
					System.out.print("输入牌序号选择出牌:");
					num = in.nextInt();	
					max_item = card[hash[num-1]].num;
					if(!(max/1000>=10&&max/1000<14&&max_item/1000>=10&&max_item/1000<14)){
						if(max_item/10>max/10){
							max=max_item;
							flag_item=j;
						}
					}
				}
				else {
					card = player[(flag+j)%4].getCard();
					System.out.println("玩家"+((flag+j)%4+1)+"出牌");
					System.out.println("可出牌有:");
					for(int k=0;k<25-i;k++){
						if(card[k].getNum()/1000==color){
							System.out.print("("+(k+1)+":"+card[k].getName()+") ");
							hash[item]=k;
							item++;
						}
					}
					if(item==0){
						for(int k=0;k<25-i;k++){
							System.out.print("("+(k+1)+":"+card[k].getName()+") ");
							hash[item]=k;
							item++;
						}
					}
					System.out.println();
					System.out.print("输入牌序号选择出牌:");
					num = in.nextInt();	
					max_item = card[hash[num-1]].num;
					if(!(item==0&&max_item/1000<4)){
						if(max_item/10>max/10){
							max=max_item;
							flag_item=j;
						}
					}
				}
			}
			flag=flag_item;
		}
	}
}
