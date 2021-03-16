package zk1;

import java.util.Scanner;
public class max3 {
	public int max(int a,int b,int c) {
		int x,y;
		x=a>b?a:b;
		y=x>c?x:c;
		return y;
	}
	public static void main(String[] args){	
		max3 aa=new max3();
		int []d = new int[3];
		Scanner input = new Scanner(System.in);
		System.out.println("请输入三个数：");
		int i=0;
		while(i<3) {
			d[i]=input.nextInt();
			i++;
		}
		int n;
		n=aa.max(d[0],d[1],d[2]);
		System.out.println(n);
	}

}
