package com.ty.ssm.Dao;
import java.util.List;
public interface GoodsMapper {
	
	int insert(Goods goods);
	
	int deleteById(int id);
	
	int updateById(int id); 
	
	Goods selectById(int id);
	
	List<Goods> findAll();

}