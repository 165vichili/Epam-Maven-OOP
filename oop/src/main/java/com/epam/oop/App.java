package com.epam.oop;

import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        int option;
    	Scanner in = new Scanner(System.in);
    	
    	Chocolate chocolate1=new Chocolate("Five-Star",100,250);
        Chocolate chocolate2=new Chocolate("Dairy-Milk",250,250);
        Chocolate chocolate3=new Chocolate("Bournville",200,250);
        
        Sweet sweets1=new Sweet("Kaju-Katli",500,250);
        Sweet sweets2=new Sweet("Laddu",300,250);
        Sweet sweets3=new Sweet("Kalakand",400,250);
    	
    	Gift gift=new Gift();
        gift.addChocolates(chocolate1,chocolate2,chocolate3);
        gift.addSweets(sweets1,sweets2,sweets3);
    	
        do{
        	System.out.println("----------NEW YEAR GIFT----------");
        	System.out.println("Select options for your Gift");
        	System.out.println("1 - Only Chocolates");
        	System.out.println("2 - Only Sweets");
        	System.out.println("3 - Chocolates and Sweets");
        	System.out.println("4 - Exit");
        	System.out.print("Enter Your Choice : ");
        	
        	option = in.nextInt();
        	switch(option)
        	{
        		case 1: System.out.println("\tChocolates Gift Box Selected");
        				ArrayList<Chocolate> arrayList = gift.getChocolates();
        				for (Chocolate c:arrayList) {
        					
        					System.out.println(c.toString());
        				
        				}
        				System.out.println("Total Weight : " + gift.chocoWeight());
        				System.out.println();
        				break;
        				
        		case 2: System.out.println("\tSweets Gift Block Selected");
        				ArrayList<Sweet> arrayList1 = gift.getSweets();
        				for (Sweet s:arrayList1){
        				
        					System.out.println(s.toString());
        				
        				}
        				System.out.println("Total Weight : " + gift.sweetWeight());
        				System.out.println();
        				break;
        				
        		case 3: System.out.println("\tChocolates and Sweets Gift Box Selected");
        				ArrayList<Chocolate> arrayList2 = gift.getChocolates();
        				ArrayList<Sweet> arrayList3 = gift.getSweets();
        				for (Chocolate c:arrayList2) {
        				
        					System.out.println(c.toString());
        				
        				}
        				System.out.println();
        				for (Sweet s:arrayList3){
        				
        					System.out.println(s.toString());
        				
        				}
        				System.out.println("Total Weight : " + (gift.chocoWeight() + gift.sweetWeight()) + "gms");
        				System.out.println();        				
        				break;
        	
        		case 4: System.out.println("\t\tThank You!!! For Your Selection");
        				System.out.println("\t\t%%%%%%%%%%Happy New Year%%%%%%%%%%"); 
        				break;
        				
        		default:System.out.println("Invalid Option");
        				System.out.println("Please Try Again");
        				break;
        	}
        }while(option < 4);
        in.close();
    }
}
