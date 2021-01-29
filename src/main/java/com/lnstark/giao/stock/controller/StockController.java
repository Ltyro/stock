package com.lnstark.giao.stock.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.lnstark.giao.stock.entity.po.Stock;
import com.lnstark.giao.stock.entity.po.Suggestion;
import com.lnstark.giao.stock.entity.vo.ResultVo;
import com.lnstark.giao.stock.service.StockService;
import com.lnstark.giao.stock.service.SuggestionService;
import com.lnstark.giao.stock.util.Constants;

import java.util.Date;
import java.util.List;

/**
 * 建议
 * 
 * @author 	Zaoji_Lai   
 * @since 	1.0
 * @date 	2021年01月29日
 */
@RestController
public class StockController {

	private HashOperations<String, String, Date> opesForHashDate;

	@Value("${custom.submitInterval}")
	private int submitInterval;

	@Autowired
	private StockService stockService;

	@Autowired
	public StockController(RedisTemplate<String, Object> template) {
		opesForHashDate = template.opsForHash();
	}

	/**
	 * 
	 */
	@GetMapping("test")
	public JSONObject add(HttpServletRequest request) {
		List<Stock> l = stockService.list();
		return ResultVo.success("ok", l);
	}
	
	
	
	public Log log = LogFactory.getLog(StockController.class);
}
