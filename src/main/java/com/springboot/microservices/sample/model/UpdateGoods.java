package com.springboot.microservices.sample.model;

//import lombok.Data;

public class UpdateGoods {
	private String  goodsNm 		; // 상품명 
	private String  goodsPrice 		; // 상품가격 
	private String  goodsImg 	    ; // 상품이미지 

	public UpdateGoods() {
		
	}

	public String getGoodsNm() {
		return goodsNm;
	}

	public void setGoodsNm(String goodsNm) {
		this.goodsNm = goodsNm;
	}

	public String getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public String getGoodsImg() {
		return goodsImg;
	}

	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}
	
	
}

