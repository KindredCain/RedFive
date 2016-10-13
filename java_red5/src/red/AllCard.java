package red;

import java.util.*;

public class AllCard {
	int p,n,c;
	int sum,sump,sumn,sumc;
	public ArrayList<Integer> cards = new ArrayList<Integer>();
	AllCard(){
		for(c=0;c<4;c++){
			sum=0;
			sumc=sum;
			sum+=c*1000;
			for(n=0;n<13;n++){
				sumn=sum;
				sum+=n*10;
				for(p=0;p<2;p++){
					sump=sum;
					sum+=p;
					cards.add(sum);
					sum=sump;
				}
				sum=sumn;
			}
			sum=sumc;
		}
		cards.add(90001);
		cards.add(80001);
		cards.add(90000);
		cards.add(80000);
	}
}
