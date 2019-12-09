package com.mycompany.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "enquire_details")
public class EnquireDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long enquiryId;
	private String CustomerName;
	private int customerPhone;
	private String email;
	private Date date;
	@ManyToMany
	@JoinTable(name = "enquiry_product", joinColumns = @JoinColumn(name = "enquryId"),inverseJoinColumns = @JoinColumn(name = "productId"))
	private Set<Product> products;
	private  boolean hasBeenContacted;
	public long getEnquiryId() {
		return enquiryId;
	}
	public void setEnquiryId(long enquiryId) {
		this.enquiryId = enquiryId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public int getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(int customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	public boolean isHasBeenContacted() {
		return hasBeenContacted;
	}
	public void setHasBeenContacted(boolean hasBeenContacted) {
		this.hasBeenContacted = hasBeenContacted;
	}
	
	
	
}
