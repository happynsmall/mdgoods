package com.springboot.microservices.sample.presentation;

/*
 * Presentation Layer: GoodsController
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.microservices.sample.model.UpdateGoods;
import com.springboot.microservices.sample.model.Goods;
import com.springboot.microservices.sample.service.GoodsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@Api(value="Goods API")
@RestController
public class GoodsController {

	@Autowired
	private GoodsService goodsService;
	
	@GetMapping("/goods")	
	@ApiOperation(value="상품 정보 가져오기", notes="상품 정보를 제공합니다. ")
	public ResponseEntity <List<Goods>> getGoodsList() { 
		return goodsService.getGoodsList();
	}
	
	
	@GetMapping("/goods/{goodsCd}")
	@ApiOperation(value="상품코드로 상품 정보 가져오기 ")
	public ResponseEntity <Goods> getGoodsById(
				@PathVariable (name="goodsCd", required = true) String goodsCd
			) { 
		return goodsService.getGoodsById(goodsCd);
	}
	
	@PutMapping("/goods/{goodsCd}")
	@ApiOperation(value="상품 정보 변경하기 ")
	public ResponseEntity <String > setGoodsUpdate(
			@PathVariable(name="goodsCd",required = true ) String goodsCd, 
			@RequestBody Goods sampleGoods
		) throws Exception { 
		
		return goodsService.setGoodsUpdate(goodsCd, sampleGoods);
	}
	
	@PostMapping("/goods")
	@ApiOperation(value="상품 정보 등록하기 ")
	public ResponseEntity <String > setGoodsInsert(
			@RequestBody Goods sampleGoods
		) throws Exception { 
		
		return goodsService.setGoodsInsert(sampleGoods);
	}
	
	@DeleteMapping("/goods/{goodsCd}")
	@ApiOperation(value="상품 정보 삭제하기 ")
	public ResponseEntity <String > setGoodsDelete(
			@PathVariable(name="goodsCd",required = true ) String goodsCd
		) throws Exception { 
		
		return goodsService.setGoodsDelete(goodsCd);
	}

	@GetMapping("/createtestgoods/{startGoodsCd}/{goodsCount}")
	@ApiOperation(value="테스트 상품를 goodsCount명 등록하기 ")
	public ResponseEntity <String > createTestGoodss(
			@PathVariable (name="startGoodsCd", required = true) int startGoodsCd,
			@PathVariable (name="goodsCount", required = true) int goodsCount
		) throws Exception { 
		
		return goodsService.createTestGoods(startGoodsCd, goodsCount);
	}	
}