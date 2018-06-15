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
	
	//响应添加商品类型
	@RequestMapping("/toAddGoodsType")
	public String toAddGoodsType() {
		return "AddGoodsType";
	}
	
	
	@RequestMapping("/addGoodsType")
	//响应添加商品类型成功
	public String  addGoods(GoodsType goodsType) {
		int result = goodsTypeMapperImp.insert(goodsType);
		return "success";
	}
	
	
	@RequestMapping("/showGoodsType")
	//响应查看商品类型
	public String showGoods(HttpServletRequest request) {
		List<GoodsType> goodsTypeList = goodsTypeMapperImp.findAll();
		request.setAttribute("goodsTypeList", goodsTypeList);
		return "goodsType_show";
		
	}
	
	
	@RequestMapping("/updateType/{id_type} ")
	//响应更新商品类型
	public String update(@PathVariable String id_type,HttpServletRequest request){
		int id_int = Integer.parseInt(id_type);
		GoodsType goodsType= goodsTypeMapperImp.selectById(id_int);
		request.setAttribute("goodsType", goodsType);
		return "goodsType_update";
	}
	
	@RequestMapping("/updateGoodsType/{id_type}")
	//响应更新商品类型成功
	public String updateGoods(@PathVariable String id_type) {
		int id_int = Integer.parseInt(id_type);
		int result = goodsTypeMapperImp.updateById(id_int);
		return "success";
	}
	
	@RequestMapping("/deleteType/{id_type}")
	//响应删除商品类型成功
	public String delete(@PathVariable String id_type){
		int id_int = Integer.parseInt(id_type);
		int result = goodsTypeMapperImp.deleteById(id_int);
		return "success";
		
		
	}
	
}
