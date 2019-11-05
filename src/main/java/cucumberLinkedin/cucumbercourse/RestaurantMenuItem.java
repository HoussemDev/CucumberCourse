package cucumberLinkedin.cucumbercourse;

public class RestaurantMenuItem {
	
	private String ItemName;
	private String Descritpion;
	private int Price;
	
	 
	public RestaurantMenuItem(String itemName, String descritpion, int price) {
		super();
		ItemName = itemName;
		Descritpion = descritpion;
		Price = price;
	}
	public String getItemName() {
		return ItemName;
	}
	public String getDescritpion() {
		return Descritpion;
	}
	public void setDescritpion(String descritpion) {
		Descritpion = descritpion;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	

}
