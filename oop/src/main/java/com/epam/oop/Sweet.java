package com.epam.oop;

public class Sweet implements Comparable<Sweet> {

	public String name;
	public int price;
	public int weight;
	
	public Sweet(String name,int price,int weight) {
		this.name = name;
		this.price = price;
		this.weight = weight;	
	}
	
	@Override
	public int compareTo(Sweet o) {
		if(o.price > price)
            return 1;
        if(o.price < price)
            return -1;
        else
            return 0;
	}
	
	 @Override
	 public String toString() {
	        return '\'' + name + '\'' +", Price = Rs. " + price +", Weight = " + weight +"gms";
    }

}
