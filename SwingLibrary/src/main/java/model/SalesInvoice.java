package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sale")
public class SalesInvoice {// Hóa đơn xuất
	@Id
	@Column(name = "sale_id")
	Integer id;
	
	@Column(name = "sale_date")
	String InvoiceDate;// Ngày xuất hóa đơn
	
	@Column(name = "employee_name")
	String employeeName;
	
	@Column(name = "book_name")
	String bookName;
	
	@Column(name = "sale_quantity")
	Integer quantity;
	
	@Column(name = "sale_price")
	double price;
	
	@Column(name = "sale_amount")
	double amount;

	public SalesInvoice() {
		super();
	}

	public SalesInvoice(Integer id, String invoiceDate, String employeeName, String bookName, Integer quantity,
			double price, double amount) {
		super();
		this.id = id;
		InvoiceDate = invoiceDate;
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

	public String getInvoiceDate() {
		return InvoiceDate;
	}

	public void setInvoiceDate(String invoiceDate) {
		InvoiceDate = invoiceDate;
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
