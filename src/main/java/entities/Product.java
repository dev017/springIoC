package entities;

import java.util.*;

public class Product {

	private String id;
	private String name;
	private long price;
	private Category category;
	private List<String> colors;
	private Date creationDate;

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Product() {
	}

	public Product(String id, String name, long price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Product(String id, String name, long price, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public Product(String id, String name, long price, Category category,
			List<String> colors) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.colors = colors;
	}

	public Product(String id, String name, long price, Category category,
			List<String> colors, Date creationDate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.colors = colors;
		this.creationDate = creationDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}

}
