package com.pricechecker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String productName;
	private String category;
	@Column(columnDefinition = "TEXT",length=5000)
	private String a_description;
	private double a_mrp;
	private double a_offerPrice;
	@Column(columnDefinition = "TEXT",length=5000)
	private String a_source;
	@Column(columnDefinition = "TEXT",length=5000)
	private String a_imgSource;
	@Column(columnDefinition = "TEXT",length=5000)
	private String f_description;
	private double f_mrp;
	private double f_offerPrice;
	@Column(columnDefinition = "TEXT",length=5000)
	private String f_source;
	@Column(columnDefinition = "TEXT",length=5000)
	private String f_imgSource;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getA_description() {
		return a_description;
	}
	public void setA_description(String a_description) {
		this.a_description = a_description;
	}
	public double getA_mrp() {
		return a_mrp;
	}
	public void setA_mrp(double a_mrp) {
		this.a_mrp = a_mrp;
	}
	public double getA_offerPrice() {
		return a_offerPrice;
	}
	public void setA_offerPrice(double a_offerPrice) {
		this.a_offerPrice = a_offerPrice;
	}
	public String getA_source() {
		return a_source;
	}
	public void setA_source(String a_source) {
		this.a_source = a_source;
	}
	public String getA_imgSource() {
		return a_imgSource;
	}
	public void setA_imgSource(String a_imgSource) {
		this.a_imgSource = a_imgSource;
	}
	public String getF_description() {
		return f_description;
	}
	public void setF_description(String f_description) {
		this.f_description = f_description;
	}
	public double getF_mrp() {
		return f_mrp;
	}
	public void setF_mrp(double f_mrp) {
		this.f_mrp = f_mrp;
	}
	public double getF_offerPrice() {
		return f_offerPrice;
	}
	public void setF_offerPrice(double f_offerPrice) {
		this.f_offerPrice = f_offerPrice;
	}
	public String getF_source() {
		return f_source;
	}
	public void setF_source(String f_source) {
		this.f_source = f_source;
	}
	public String getF_imgSource() {
		return f_imgSource;
	}
	public void setF_imgSource(String f_imgSource) {
		this.f_imgSource = f_imgSource;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", productName=" + productName + ", category=" + category + ", a_description="
				+ a_description + ", a_mrp=" + a_mrp + ", a_offerPrice=" + a_offerPrice + ", a_source=" + a_source
				+ ", a_imgSource=" + a_imgSource + ", f_description=" + f_description + ", f_mrp=" + f_mrp
				+ ", f_offerPrice=" + f_offerPrice + ", f_source=" + f_source + ", f_imgSource=" + f_imgSource + "]";
	}
	
	
}
