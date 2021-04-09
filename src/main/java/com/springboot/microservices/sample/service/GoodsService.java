package com.springboot.microservices.sample.service;

/*
 * Service Layer: GoodsService
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springboot.microservices.sample.domain.TestDomain;
import com.springboot.microservices.sample.domain.GoodsDomain;
import com.springboot.microservices.sample.model.UpdateGoods;
import com.springboot.microservices.sample.model.Goods;

@Service
public class GoodsService {
	@Autowired
	private GoodsDomain goodsDomain;
	
	@Autowired 
	private TestDomain testDomain;
	
	public ResponseEntity <List<Goods>> getGoodsList() { 
		return goodsDomain.getGoodsList();
	}
	
	public ResponseEntity <Goods> getGoodsById(String goodsCd) { 
		return goodsDomain.getGoodsById(goodsCd);
	}
	
	public ResponseEntity <String > setGoodsUpdate(String goodsCd, Goods sampleGoods) throws Exception {
		return goodsDomain.setGoodsUpdate(goodsCd, sampleGoods);
	}
	
	public ResponseEntity <String > setGoodsInsert(Goods sampleGoods) throws Exception { 
		return goodsDomain.setGoodsInsert(sampleGoods);		
	}

	public ResponseEntity <String > setGoodsDelete(String goodsCd) throws Exception { 
		return goodsDomain.setGoodsDelete(goodsCd);
	}
	
	public ResponseEntity <String > createTestGoods(int startGoodsCd, int goodsCount) throws Exception { 
		return testDomain.createTestGoods(startGoodsCd, goodsCount);
	}
}
