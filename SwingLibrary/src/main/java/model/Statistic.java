package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "statitic")
public class Statistic {// Thống kê
	@Id
	@Column(name = "statitic_id")
	Integer id;
	
	@Column(name = "statitic_date")
	String date;
	
	@Column(name = "book_name")
	String bookName;
	
	@Column(name = "statitic_quantity")
	int quantity;// Số lượng hàng tồn kho

	public Statistic() {
		super();
	}

	public Statistic(Integer id, String date, String bookName, int inventoryQuantity) {
		super();
		this.id = id;
		this.date = date;
		this.bookName = bookName;
		this.quantity = inventoryQuantity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getInventoryQuantity() {
		return quantity;
	}

	public void setInventoryQuantity(int inventoryQuantity) {
		this.quantity = inventoryQuantity;
	}

}
