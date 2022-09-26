package tw.com.beans;

public class Item {
	private String name;
	private int price;
	public Item(String name,int price) {
		this.name = name;
		this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
