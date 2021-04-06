package com.springboot.microservices.sample.model;




public class Goods {
	private String  goodsCd			; // 상품명
	private String  goodsNm 		; // 상품명 
	private String  goodsPrice 		; // 상품가격 
	private String  goodsImg 	    ; // 상품이미지 

	public Goods() {
		
	}


	public String getGoodsCd() {
		return goodsCd;
	}


	public void setGoodsCd(String goodsCd) {
		this.goodsCd = goodsCd;
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