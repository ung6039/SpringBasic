package com.sist.dao;

import java.util.Date;

public class CroVO {

	private String productCode;
	private String tags;// 검색키워드
	private int codeNo;
	private int rank;
	private String name;
	// 할인 전 가격
	private int basePrice;
	//100g당 가격
	private String unit_price;
	//별점
	private double rate; 
	private int review_count;
	private String discount;
	
	private int lookup;
	private Date lookuptime;
	private String img;
	
	
	
	
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	public int getCodeNo() {
		return codeNo;
	}
	public void setCodeNo(int codeNo) {
		this.codeNo = codeNo;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}
	public String getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(String unit_price) {
		this.unit_price = unit_price;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getReview_count() {
		return review_count;
	}
	public void setReview_count(int review_count) {
		this.review_count = review_count;
	}
	public int getLookup() {
		return lookup;
	}
	public void setLookup(int lookup) {
		this.lookup = lookup;
	}
	public Date getLookuptime() {
		return lookuptime;
	}
	public void setLookuptime(Date lookuptime) {
		this.lookuptime = lookuptime;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
}
