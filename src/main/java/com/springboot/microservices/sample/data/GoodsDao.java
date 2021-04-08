package com.springboot.microservices.sample.data;

/*
 * Data(Persistent) Layer: GoodsDao
 */

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.microservices.sample.model.UpdateGoods;
import com.springboot.microservices.sample.model.Goods;

@Mapper
public interface GoodsDao {

	/**
	 * 사용자 전체 정보 가져오기 
	 * @return
	 * @throws Exception
	 */
	List<Goods> selectGoods() throws Exception;	
	
	/**
	 * 아이디로 사용자 정보 조회하기
	 * @param goodsCd
	 * @return
	 * @throws Exception
	 */
	Goods selectGoodsById(String goodsCd) throws Exception;	
	
	/**
	 * 사용자 정보 변경하기
	 * @param sampleGoods
	 * @return
	 * @throws Exception
	 */
	int updateGoods(Goods sampleGoods) throws Exception;
	
	/**
	 * 사용자 등록하기 
	 * @param sampleGoods
	 * @return
	 * @throws Exception
	 */
	int insertGoods(Goods sampleGoods) throws Exception;
	
	/**
	 * 사용자 정보 삭제하기 
	 * @param goodsCd
	 * @return
	 * @throws Exception
	 */
	int deleteGoods(String goodsCd) throws Exception;		
	
	/**
	 * 테스트 사용자 등록하기 
	 * @param ArrayList<Goods> goods
	 * @return
	 * @throws Exception
	 */
	int createTestGoods(ArrayList<Goods> goods) throws Exception;	

}
			