package com.ty.ssm.Dao;

import java.util.List;
public interface GoodsTypeMapper {
	
	int insert(GoodsType goodsType);//�����Ʒ����
	
	int deleteById(int id);//ͨ��IDɾ����Ʒ����
	
	int updateById(int id);//ͨ��ID������Ʒ����
	
	GoodsType selectById(int id);//ͨ��IDɸѡ��Ʒ����
	
	List<GoodsType> findAll();

}