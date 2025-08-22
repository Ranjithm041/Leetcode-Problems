package com.leetcode_679;

/*
  679 . 24 Game
 */


import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,1,8,7};
		System.out.println(judgePoint24(nums));

	}
	public static boolean judgePoint24(int[] cards) {
        List<Double> cardsList = new ArrayList<>();
        ArrayList<Integer> card = new ArrayList<>();
        for(int i=0;i<cards.length;i++){
            card.add(cards[i]);
        }
        return add(card,cardsList);
    }
    public static boolean add(ArrayList<Integer> cards, List<Double> cardsList){
        if(cardsList.size()==4){
            if(check(cardsList)) return true;
            return false;
        }
        for(int i=0;i<cards.size();i++){
            int val = cards.get(i);
            cardsList.add((double)val);
            cards.remove(i);
            if(add(cards,cardsList)) return true;
            cards.add(i,val);
            cardsList.remove(cardsList.size()-1);
        }
        return false;
    }
    public static boolean check(List<Double> list){
        double[] a = new double[4];
        double[] b = new double[4];
        a[0] = list.get(0)+list.get(1);
        b[0] = list.get(2)+list.get(3);
        a[1] = list.get(0)-list.get(1);
        b[1] = list.get(2)-list.get(3);
        a[2] = list.get(0)*list.get(1);
        b[2] = list.get(2)*list.get(3);
        a[3] = list.get(0)/list.get(1);
        b[3] = list.get(2)/list.get(3);
        
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(a[i]+b[j]==24) return true;
                if(a[i]-b[j]==24) return true;
                if(a[i]*b[j]==24) {
                  return true;  
                } 
                if(a[i]/b[j]==24) return true;
            }
        }
        double[] ab = new double[4];
        for(int i=0;i<4;i++){
            ab[0]=list.get(1)+b[i];
            ab[1]=list.get(1)-b[i];
            ab[2]=list.get(1)*b[i];
            ab[3]=list.get(1)/b[i];
            for(int j=0;j<4;j++){
                if(list.get(0)+ab[j]==24) return true;
                if(list.get(0)-ab[j]==24) return true;
                if(list.get(0)*ab[j]==24) return true;
                if(list.get(0)/ab[j]==24 || list.get(0)/ab[j]==23.99999999999999) return true;
            }
        }

        for(int i=0;i<4;i++){
            ab[0]=a[i]+list.get(2);
            ab[1]=a[i]-list.get(2);
            ab[2]=a[i]*list.get(2);
            ab[3]=a[i]/list.get(2);
            for(int j=0;j<4;j++){
                if(ab[j]+list.get(3)==24) return true;
                if(ab[j]-list.get(3)==24) return true;
                if(ab[j]*list.get(3)==24) return true;
                if(ab[j]/list.get(3)==24 ) return true;
            }
        }

        a[0] = list.get(1)+list.get(2);
        a[1] = list.get(1)-list.get(2);
        a[2] = list.get(1)*list.get(2);
        a[3] = list.get(1)/list.get(2);

        for(int i=0;i<4;i++){
            ab[0]=list.get(0)+a[i];
            ab[1]=list.get(0)+a[i];
            ab[2]=list.get(0)+a[i];
            ab[3]=list.get(0)+a[i];
            for(int j=0;j<4;j++){
                if(ab[j]+list.get(3)==24) return true;
                if(ab[j]-list.get(3)==24) return true;
                if(ab[j]*list.get(3)==24) return true;
                if(ab[j]/list.get(3)==24 ) return true;
            }
        }
        return false;
    }

}
