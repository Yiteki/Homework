package com.ty.ssm.Dao;

import java.util.List;
public interface GoodsTypeMapper {
	
	int insert(GoodsType goodsType);//添加商品类型
	
	int deleteById(int id);//通过ID删除商品类型
	
	int updateById(int id);//通过ID更新商品类型
	
	GoodsType selectById(int id);//通过ID筛选商品类型
	
	List<GoodsType> findAll();

}