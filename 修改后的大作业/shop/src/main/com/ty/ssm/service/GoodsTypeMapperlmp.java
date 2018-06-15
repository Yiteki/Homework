package com.ty.ssm.service;

import java.util.List;



import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.yht.ssm.dao.GoodsTypeMapper;
import com.yht.ssm.dao.SqlsessionDao;
import com.yht.ssm.model.Goods;
import com.yht.ssm.model.GoodsType;

@Service
public class GoodsTypeMapperImp implements GoodsTypeMapper{

	public int insert(GoodsType goodsType) {
		// TODO Auto-generated method stub
		SqlSession sqlsession = SqlsessionDao.getSqlsession();
		int result = sqlsession.insert("insert_goodsType", goodsType);
		sqlsession.commit();
		return result;
	}

	public int deleteById(int id) {
		// TODO Auto-generated method stub
		SqlSession sqlsession = SqlsessionDao.getSqlsession();
		int result = sqlsession.delete("delete_goodsType",id);
		sqlsession.commit();
		return result;
	}

	public int updateById(int id) {
		// TODO Auto-generated method stub
		SqlSession sqlsession = SqlsessionDao.getSqlsession();
		int result = sqlsession.update("update_goodsType",id);
		sqlsession.commit();
		return result;
	}

	public List<GoodsType> findAll() {
		// TODO Auto-generated method stub
		SqlSession sqlsession = SqlsessionDao.getSqlsession();
		List<GoodsType> result = sqlsession.selectList("find_goodsType");
		sqlsession.commit();
		return result;
	}

	@Override
	public GoodsType selectById(int id) {
		// TODO Auto-generated method stub
		SqlSession sqlsession = SqlsessionDao.getSqlsession();
		GoodsType result = sqlsession.selectOne("selectById",id);
		sqlsession.commit();
		return result;
	}

}
