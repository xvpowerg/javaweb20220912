package tw.com.beans;

import java.util.List;

public class Food {
	private String name;
	private int price;
	private int count;
	public Food(String name,int price,int count) {
		this.name = name;
		this.price = price;		
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getCount() {
		return count;
	}
	
	public static int getTotal(List<Food> foodList) {
		int total = 0;
		for(Food f : foodList) {
			total += f.getPrice() * f.getCount();
		}
		return total;
	}
}
