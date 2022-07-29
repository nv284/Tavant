package com.org.tav.day2;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		String[] str = {"Harsha" ,"Shivesh" ,"shivam"};
		int[][] marks = new int[3][5];
		
		marks[0][0]=80;
		marks[0][1]=90;
		marks[0][2]=92;
		
		
		marks[1][0]=80;
		marks[1][1]=80;
		marks[1][2]=80;
		
		marks[2][0]=80;
		marks[2][1]=80;
		marks[2][2]=80;
		
		for(int i =0;i<marks.length;i++) {
			int total = 0;
			for(int j = 0;j<marks.length;j++) {
				total = total+marks[i][j];
			}
			for(int k=0;k<str.length;k++) {
				System.out.println("total marks :"+str[k]+"   "+total);
				double per = total/3;
				System.out.println("percentage => "+per );

			}
		}
		
	}

}
