package com.ty.ssm.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.yht.ssm.dao.GoodsMapper;
import com.yht.ssm.dao.SqlsessionDao;
import com.yht.ssm.model.Goods;

@Service
public class GoodsMapperImp implements GoodsMapper{

	public int insert(Goods goods) {
		// TODO Auto-generated method stub
		SqlSession sqlsession = SqlsessionDao.getSqlsession();
		int result = sqlsession.insert("insert_goods", goods);
		sqlsession.commit();
		return result;
	}

	public int deleteById(int id) {
		// TODO Auto-generated method stub
		SqlSession sqlsession = SqlsessionDao.getSqlsession();
		int result = sqlsession.delete("delete_goods",id);
		sqlsession.commit();
		return result;
	}

	public int updateById(int id) {
		// TODO Auto-generated method stub
		SqlSession sqlsession = SqlsessionDao.getSqlsession();
		int result = sqlsession.update("update_goods",id);
		sqlsession.commit();
		return result;
	}
	
	

	public List<Goods> findAll() {
		// TODO Auto-generated method stub
		SqlSession sqlsession = SqlsessionDao.getSqlsession();
		List<Goods> result = sqlsession.selectList("find_goods");
		sqlsession.commit();
		return result;
	}

	public Goods selectById(int id) {
		// TODO Auto-generated method stub
		SqlSession sqlsession = SqlsessionDao.getSqlsession();
		Goods result = sqlsession.selectOne("selectById",id);
		sqlsession.commit();
		return result;
	}
	
	

}