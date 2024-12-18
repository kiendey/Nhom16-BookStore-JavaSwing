package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "purchase")
public class PurchaseInvoice {// Hóa đơn nhập
	@Id
	@Column(name = "purchase_id")
	Integer id;
	
	@Column(name = "purchase_date")
	String Importdate;// Ngày nhập
	
	@Column(name = "employee_name")
	String employeeName;// Tên nhân viên nhập hàng
	
	@Column(name = "book_name")
	String bookName;
	
	@Column(name = "purchase_quantity")
	Integer quantity;// Số lượng
	
	@Column(name = "purchase_price")
	double price;
	
	@Column(name = "purchase_amount")
	double amount;// Thành tiền

	public PurchaseInvoice() {
		super();
	}

	public PurchaseInvoice(Integer id, String importdate, String employeeName, String bookName, Integer quantity,
			double price, double amount) {
		super();
		this.id = id;
		Importdate = importdate;
		this.employeeName = employeeName;
		this.bookName = bookName;
		this.quantity = quantity;
		this.price = price;
		this.amount = amount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImportdate() {
		return Importdate;
	}

	public void setImportdate(String importdate) {
		Importdate = importdate;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
