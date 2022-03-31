package product;

public class productBaseInfo {
	int id;
	String name;
	float price;
	String colour;
	public productBaseInfo() {}
	public productBaseInfo(int id, String name, float price, String colour) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.colour = colour;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "productBaseInfo [id=" + id + ", name=" + name + ", price=" + price + ", colour=" + colour + "]";
	}
	
	
}
	
