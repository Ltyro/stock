package com.lnstark.giao.stock.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lnstark.giao.stock.entity.po.Stock;
import com.lnstark.giao.stock.mapper.StockMapper;
import com.lnstark.giao.stock.service.StockService;

@Service
@Transactional
public class StockServiceImpl implements StockService {

	@Autowired
	private StockMapper stockMapper;

	@Override
	public List<Stock> list() {
		QueryWrapper<Stock> qw = new QueryWrapper<>();
		List<Stock> stocks = stockMapper.selectList(qw);
		return stocks;
	}
	
	
}
