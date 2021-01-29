package com.lnstark.giao.stock.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("suggestion")
public class Suggestion {

	@TableId
	@TableField("id")
	private int id;

	@TableField("ip")
	private String ip;

	@TableField("content")
	private String content;

	@TableField("sug_time")
	private Date sugTime;

	public Suggestion() {}

	public Suggestion(String ip, String content, Date sugTime) {
		this.ip = ip;
		this.content = content;
		this.sugTime = sugTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getSugTime() {
		return sugTime;
	}

	public void setSugTime(Date sugTime) {
		this.sugTime = sugTime;
	}
	
	
}
