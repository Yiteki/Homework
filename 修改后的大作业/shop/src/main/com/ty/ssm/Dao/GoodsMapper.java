package com.ty.ssm.Dao;
import java.util.List;

public interface GoodsMapper {
	
	int insert(Goods goods);//�����Ʒ
	
	int deleteById(int id);//ͨ��IDɾ����Ʒ
	
	int updateById(int id); //ͨ��ID������Ʒ
	
	Goods selectById(int id);//ͨ��IDɸѡ��Ʒ
	
	List<Goods> findAll();

}