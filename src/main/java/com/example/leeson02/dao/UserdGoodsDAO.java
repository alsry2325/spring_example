package com.example.leeson02.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.leeson02.model.UsedGoods;

@Repository
public interface UserdGoodsDAO {

	
	public List<UsedGoods>selectUsedGoodsList();
}
