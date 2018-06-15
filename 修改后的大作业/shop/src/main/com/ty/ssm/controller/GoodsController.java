package com.ty.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yht.ssm.model.Goods;
import com.yht.ssm.service.GoodsMapperImp;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	
	@Autowired
	GoodsMapperImp goodsMapperImp;
	
	
	@RequestMapping("/toAddGoods")
	//�����Ʒ����
	public String toAddGoods() {
		return "AddGoods";
	}
	
	
	@RequestMapping("/addGoods")
	//�����Ʒ��õ��ķ���ֵ
	public String  addGoods(Goods goods) {
		int result = goodsMapperImp.insert(goods);
		return "success";
	}
	
	
	@RequestMapping("/showGoods")
	//���ز鿴��Ʒ���ֵ
	public String showGoods(HttpServletRequest request) {
		List<Goods> goodsList = goodsMapperImp.findAll();
		request.setAttribute("goodsList", goodsList);
		return "goods_show";
		
	}
	
	
	@RequestMapping("/update/{id} ")
	//���ظ��º��ֵ
	public String update(@PathVariable String id,HttpServletRequest request){
		int id_int = Integer.parseInt(id);
		Goods goods= goodsMapperImp.selectById(id_int);
		request.setAttribute("goods", goods);
		return "goods_update";
	}
	
	@RequestMapping("/updateGoods/{id}")
	//���ػ�����³ɹ�
	public String updateGoods(@PathVariable String id) {
		int id_int = Integer.parseInt(id);
		int result = goodsMapperImp.updateById(id_int);
		return "success";
	}
	
	@RequestMapping("/delete/{id}")
	//���ػ���ɾ���ɹ�
	public String delete(@PathVariable String id){
		int id_int = Integer.parseInt(id);
		int result = goodsMapperImp.deleteById(id_int);
		return "success";
		
		
	}
	
	
	

}
