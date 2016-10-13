package red;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Take {
	String[] collor = new String[]{"黑桃","红桃","草花","方块"};
	String[] number = new String[]{"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	AllCard allcard = new AllCard();
	String name;
	Map<Integer,String> people1 = new HashMap<Integer,String>();
	Map<Integer,String> people2 = new HashMap<Integer,String>();
	Map<Integer,String> people3 = new HashMap<Integer,String>();
	Map<Integer,String> people4 = new HashMap<Integer,String>();
	public Take(int item){
		Collections.shuffle(allcard.cards);
		for(int i=0;i<25;i++){
			int id=allcard.cards.get(i);
			if(id==90001||id==90000)
				name="大王";
			else if(id==80001||id==80000)
				name="小王";
			else{
				name=""+collor[id/1000]+number[id%1000/10];
				if(id<10000&&id/1000==1&&id%1000/10==3)
					id+=99999;
				if(id<10000&&id/1000==item)
					id+=4000;
				if(id<10000&&(id/1000+item)%2==0&&id%1000/10==1)
					id+=20000;
				if(id<10000&&id%1000/10==0)
					id+=10000;
			}
			people1.put(id, name);
		}
		for(int i=25;i<50;i++){
			int id=allcard.cards.get(i);
			if(id==90001||id==90000)
				name="大王";
			else if(id==80001||id==80000)
				name="小王";
			else{
				name=""+collor[id/1000]+number[id%1000/10];
				if(id<10000&&id/1000==1&&id%1000/10==3)
					id+=99999;
				if(id<10000&&id/1000==item)
					id+=4000;
				if(id<10000&&(id/1000+item)%2==0&&id%1000/10==1)
					id+=20000;
				if(id<10000&&id%1000/10==0)
					id+=10000;
			}
			people2.put(id, name);
		}
		for(int i=50;i<75;i++){
			int id=allcard.cards.get(i);
			if(id==90001||id==90000)
				name="大王";
			else if(id==80001||id==80000)
				name="小王";
			else{
				name=""+collor[id/1000]+number[id%1000/10];
				if(id<10000&&id/1000==1&&id%1000/10==3)
					id+=99999;
				if(id<10000&&id/1000==item)
					id+=4000;
				if(id<10000&&(id/1000+item)%2==0&&id%1000/10==1)
					id+=20000;
				if(id<10000&&id%1000/10==0)
					id+=10000;
			}
			people3.put(id, name);
		}
		for(int i=75;i<100;i++){
			int id=allcard.cards.get(i);
			if(id==90001||id==90000)
				name="大王";
			else if(id==80001||id==80000)
				name="小王";
			else{
				name=""+collor[id/1000]+number[id%1000/10];
				if(id<10000&&id/1000==1&&id%1000/10==3)//红五
					id+=99999;
				if(id<10000&&id/1000==item)//主牌
					id+=4000;
				if(id<10000&&(id/1000+item)%2==0&&id%1000/10==1)//3
					id+=20000;
				if(id<10000&&id%1000/10==0)//2
					id+=10000;
			}
			people4.put(id, name);
		}
	}
	public Map<Integer, String> getPeople1() {
		return people1;
	}
	public void setPeople1(Map<Integer, String> people1) {
		this.people1 = people1;
	}
	public Map<Integer, String> getPeople2() {
		return people2;
	}
	public void setPeople2(Map<Integer, String> people2) {
		this.people2 = people2;
	}
	public Map<Integer, String> getPeople3() {
		return people3;
	}
	public void setPeople3(Map<Integer, String> people3) {
		this.people3 = people3;
	}
	public Map<Integer, String> getPeople4() {
		return people4;
	}
	public void setPeople4(Map<Integer, String> people4) {
		this.people4 = people4;
	}

}
