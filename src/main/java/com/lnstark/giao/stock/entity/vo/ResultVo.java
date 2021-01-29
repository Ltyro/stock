package com.lnstark.giao.stock.entity.vo;

import java.util.Map;

import com.alibaba.fastjson.JSONObject;

/**
 * 接口返回
 * 
 * @author 	Zaoji_Lai   
 * @since 	1.0
 * @date 	2020年9月3日
 */
public class ResultVo {

	public static JSONObject success(String msg, Object object) {
		JSONObject result = new JSONObject();
		result.fluentPut("flag", true).fluentPut("msg", msg).fluentPut("data", object);
		return result;
	}
	
	public static JSONObject success(String msg) {
		JSONObject result = new JSONObject();
		result.fluentPut("flag", true).fluentPut("msg", msg);
		return result;
	}
	
	public static JSONObject fail(String msg) {
		return fail(msg, null);
	}
	
	public static JSONObject fail(String msg, Map<String, Object> attr) {
		JSONObject result = new JSONObject();
		result.fluentPut("flag", false).fluentPut("msg", msg);
		if (attr != null) {
			result.putAll(attr);
		}
		return result;
	}
}
