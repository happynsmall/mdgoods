package com.springboot.microservices.sample.domain;

/*
 * Domain(Business) Layer: GoodsDomain
 */

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springboot.microservices.sample.data.GoodsDao;
import com.springboot.microservices.sample.model.UpdateGoods;
import com.springboot.microservices.sample.model.Goods;

@Service
public class GoodsDomain {
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private GoodsDao sampleGoodsDao;
	
	/*
	 * getGoodsList: 상품 목록을 100개까지 리턴
	 */
	public ResponseEntity <List<Goods>> getGoodsList() { 
		
		List<Goods> list = null;
		try {
			log.info("Start db select");
			list = sampleGoodsDao.selectGoods();
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.debug("goods counts :"+list.size());
		
		return new ResponseEntity<List<Goods>> (list, HttpStatus.OK);
	}
	
	/*
	 * getGoodsById: goodsCd에 해당하는 상품정보 리턴 
	 */
	public ResponseEntity <Goods> getGoodsById(String goodsCd) { 
		Goods re = null;
		try {
			log.info("Start db select");
			re = sampleGoodsDao.selectGoodsById(goodsCd);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<Goods> (re, HttpStatus.OK);
	}
	
	/*
	 * setGoodsUpdate: 상품 정보 변경 
	 */
	public ResponseEntity <String > setGoodsUpdate(String goodsCd, Goods sampleGoods) throws Exception { 
		log.info("Start db update==>"+goodsCd);

		int re  = sampleGoodsDao.updateGoods(sampleGoods);
		log.debug("result :"+ re);
		
		return new ResponseEntity<String> (re+"", HttpStatus.OK);
	}

	/*
	 * setGoodsInsert: 상품 추가 
	 */
	public ResponseEntity <String > setGoodsInsert(Goods sampleGoods) throws Exception { 
		log.info("Start db insert");
		int re  = sampleGoodsDao.insertGoods(sampleGoods);
		log.debug("result :"+ re);
		
		return new ResponseEntity<String> (re+"", HttpStatus.OK);
	}
	
	/*
	 *  setGoodsDelete: 상품 삭제 
	 */
	public ResponseEntity <String > setGoodsDelete(String goodsCd) throws Exception { 
		log.info("Start db insert");
		int re  = sampleGoodsDao.deleteGoods(goodsCd);
		log.debug("result :"+ re);
		
		return new ResponseEntity<String> (re+"", HttpStatus.OK);
	}
	
}
