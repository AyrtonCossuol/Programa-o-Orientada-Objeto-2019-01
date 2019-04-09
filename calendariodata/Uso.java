package com.calendariodata;

import java.util.Scanner;

public class Uso {
	
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) throws Exception {
		/*boolean a = Data.isDataValida(10,12, 1996);
		if (a) {
			System.out.println("true");
		}*/
		Data date = new Data();
		Data date2 = new Data();
		String dateIncrementa1;
		String dateIncrementa2;
		int cont = 0;
		
		while(cont != 3){
			try{
				System.out.print("Entre com a primeira data: ");
			  	date.setData(new Scanner(System.in).nextLine()); 	
			  	
			  	System.out.print("Entre com a segunda data: ");
			  	date2.setData(new Scanner(System.in).nextLine());
			  		 
				System.out.println("\nData 1: "+date.data+"");
				System.out.println("Data 2: "+date2.data+"\n");
				
				System.out.println("As duas datas são iguais? "+ date.equals(date2));
				break;
			}
			catch(Exception e){
				cont ++;
				System.out.println("A primeira ou a segunda data estão incorretas, digite novamente.\n");
			}
		}
		if(cont == 3){
			date.setData();
			System.out.println(date.data);
		}
		System.out.println(date.compareTo(date2));
		/*date.setData(30,11,1998);
		dateIncrementa1 = date.incrementa(3);
		//dateIncrementa2 = date2.incrementa();
		System.out.println(dateIncrementa1);
		//System.out.println(dateIncrementa2);*/
	}
}