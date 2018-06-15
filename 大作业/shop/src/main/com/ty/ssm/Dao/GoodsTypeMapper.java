package com.ty.ssm.Dao;

import java.util.List;
public interface GoodsTypeMapper {
	
	int insert(GoodsType goodsType);
	
	int deleteById(int id);
	
	int updateById(int id);
	
	GoodsType selectById(int id);
	
	List<GoodsType> findAll();

}