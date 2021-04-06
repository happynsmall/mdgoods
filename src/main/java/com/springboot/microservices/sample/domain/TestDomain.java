package com.springboot.microservices.sample.domain;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springboot.microservices.sample.data.UserDao;
import com.springboot.microservices.sample.model.User;

import com.springboot.microservices.sample.data.GoodsDao;
import com.springboot.microservices.sample.model.Goods;

@Service
public class TestDomain {
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserDao sampleUserDao;
	private GoodsDao sampleGoodsDao;
	
	public ResponseEntity <String> createTestUsers(int startUserId, int userCount) throws Exception { 
		log.info("***** Start creating Test users "+userCount+"명");
		
		ArrayList<User> list = new ArrayList<User>();
		User user = null;
		
		for(int i=0; i < userCount-startUserId + 1; i++) {
			user = new User();
			
			user.setUserId("user"+String.format("%08d", startUserId+i));
			user.setUserNm("유저"+String.format("%08d", startUserId+i));
			user.setAddr("");
			user.setCellPhone(String.format("%08d", startUserId+i));
			user.setBirthDt(String.format("%08d", startUserId+i));
			user.setAgreeInfo("");
			
			list.add(user);
		}
		log.info("Added User object in list==>"+list.size());
		
		sampleUserDao.createTestUsers(list);
			
		log.info("***** End creating Test users "+userCount+"명");
		
		return new ResponseEntity<String> ("1", HttpStatus.OK);
	}
	
	public ResponseEntity <String> createTestGoods(int startGoodsCd, int goodsCount) throws Exception { 
		log.info("***** Start creating Test users "+goodsCount+"명");
		
		ArrayList<User> list = new ArrayList<User>();
		User user = null;
		
		for(int i=0; i < goodsCount-startGoodsCd + 1; i++) {
			user = new User();
			
			user.setUserId("user"+String.format("%08d", startGoodsCd+i));
			user.setUserNm("유저"+String.format("%08d", startGoodsCd+i));
			user.setAddr("");
			user.setCellPhone(String.format("%08d", startGoodsCd+i));
			user.setBirthDt(String.format("%08d", startGoodsCd+i));
			user.setAgreeInfo("");
			
			list.add(user);
		}
		log.info("Added User object in list==>"+list.size());
		
		sampleUserDao.createTestUsers(list);
			
		log.info("***** End creating Test users "+goodsCount+"명");
		
		return new ResponseEntity<String> ("1", HttpStatus.OK);
	}	
}
