package com.ty.ssm.Dao;
import java.util.List;

public interface GoodsMapper {
	
	int insert(Goods goods);//添加商品
	
	int deleteById(int id);//通过ID删除商品
	
	int updateById(int id); //通过ID更新商品
	
	Goods selectById(int id);//通过ID筛选商品
	
	List<Goods> findAll();

}