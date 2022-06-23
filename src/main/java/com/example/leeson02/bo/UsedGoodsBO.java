package com.example.leeson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.leeson02.dao.UserdGoodsDAO;
import com.example.leeson02.model.UsedGoods;

@Service
public class UsedGoodsBO {

	@Autowired
	private UserdGoodsDAO usedGoodsDAO;  //DI: Dependency Injection
	
	public List<UsedGoods> getUsedGoodsList(){
		
		return	usedGoodsDAO.selectUsedGoodsList();
	}
}
