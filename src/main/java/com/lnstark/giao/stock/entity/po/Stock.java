package com.lnstark.giao.stock.entity.po;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("history_a_stock_k_data")
public class Stock {
	
	private Date date;
	private String code;
	private Double open;
	private Double close;
	private Double high;
	private Double low;
	private long volume;
	private long amount;
	private int adjustflag;
	private Double turn;
	private int tradestatus;
	private Double pctChg;
	private int isST;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Double getOpen() {
		return open;
	}
	public void setOpen(Double open) {
		this.open = open;
	}
	public Double getClose() {
		return close;
	}
	public void setClose(Double close) {
		this.close = close;
	}
	public Double getHigh() {
		return high;
	}
	public void setHigh(Double high) {
		this.high = high;
	}
	public Double getLow() {
		return low;
	}
	public void setLow(Double low) {
		this.low = low;
	}
	public long getVolume() {
		return volume;
	}
	public void setVolume(long volume) {
		this.volume = volume;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public int getAdjustflag() {
		return adjustflag;
	}
	public void setAdjustflag(int adjustflag) {
		this.adjustflag = adjustflag;
	}
	public Double getTurn() {
		return turn;
	}
	public void setTurn(Double turn) {
		this.turn = turn;
	}
	public int getTradestatus() {
		return tradestatus;
	}
	public void setTradestatus(int tradestatus) {
		this.tradestatus = tradestatus;
	}
	public Double getPctChg() {
		return pctChg;
	}
	public void setPctChg(Double pctChg) {
		this.pctChg = pctChg;
	}
	public int getIsST() {
		return isST;
	}
	public void setIsST(int isST) {
		this.isST = isST;
	}
	
	
}
