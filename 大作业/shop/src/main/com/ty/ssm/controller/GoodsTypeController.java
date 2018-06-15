package com.ty.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yht.ssm.model.Goods;
import com.yht.ssm.model.GoodsType;
import com.yht.ssm.service.GoodsMapperImp;
import com.yht.ssm.service.GoodsTypeMapperImp;

@Controller
@RequestMapping("/goodsType")
public class GoodsTypeController {
	
	@Autowired
	GoodsTypeMapperImp goodsTypeMapperImp;
	
	
	@RequestMapping("/toAddGoodsType")
	public String toAddGoodsType() {
		return "AddGoodsType";
	}
	
	
	@RequestMapping("/addGoodsType")
	public String  addGoods(GoodsType goodsType) {
		int result = goodsTypeMapperImp.insert(goodsType);
		return "success";
	}
	
	
	@RequestMapping("/showGoodsType")
	public String showGoods(HttpServletRequest request) {
		List<GoodsType> goodsTypeList = goodsTypeMapperImp.findAll();
		request.setAttribute("goodsTypeList", goodsTypeList);
		return "goodsType_show";
		
	}
	
	
	@RequestMapping("/updateType/{id_type} ")
	public String update(@PathVariable String id_type,HttpServletRequest request){
		int id_int = Integer.parseInt(id_type);
		GoodsType goodsType= goodsTypeMapperImp.selectById(id_int);
		request.setAttribute("goodsType", goodsType);
		return "goodsType_update";
	}
	
	@RequestMapping("/updateGoodsType/{id_type}")
	public String updateGoods(@PathVariable String id_type) {
		int id_int = Integer.parseInt(id_type);
		int result = goodsTypeMapperImp.updateById(id_int);
		return "success";
	}
	
	@RequestMapping("/deleteType/{id_type}")
	public String delete(@PathVariable String id_type){
		int id_int = Integer.parseInt(id_type);
		int result = goodsTypeMapperImp.deleteById(id_int);
		return "success";
		
		
	}
	
}
