
package com.stock.bean;

public class StockInfoBean {
	private String stockid;
	private String stockName;
	private String stockPy;
	private String stockPrice;
	private String stockNum;

	public StockInfoBean() {
		super();
	}

	/**
	 * @param stockid
	 * @param stockName
	 * @param stockPy
	 * @param stockPrice
	 * @param stockNum
	 */
	public StockInfoBean(String stockid, String stockName, String stockPy,
			String stockPrice, String stockNum) {
		super();
		this.stockid = stockid;
		this.stockName = stockName;
		this.stockPy = stockPy;
		this.stockPrice = stockPrice;
		this.stockNum=stockNum;
	}

	/**
	 * @return stockid
	 */
	public String getStockid() {
		return stockid;
	}

	/**
	 * @param stockid
	 *            要设置的 stockid
	 */
	public void setStockid(String stockid) {
		this.stockid = stockid;
	}

	/**
	 * @return stockName
	 */
	public String getStockName() {
		return stockName;
	}

	/**
	 * @param stockName
	 *            要设置的 stockName
	 */
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	/**
	 * @return stockPy
	 */
	public String getStockPy() {
		return stockPy;
	}

	/**
	 * @param stockPy
	 *            要设置的 stockPy
	 */
	public void setStockPy(String stockPy) {
		this.stockPy = stockPy;
	}

	/**
	 * @return stockPrice
	 */
	public String getStockPrice() {
		return stockPrice;
	}

	/**
	 * @param stockPrice
	 *            要设置的 stockPrice
	 */
	public void setStockPrice(String stockPrice) {
		this.stockPrice = stockPrice;
	}

	/**
	 * @return stockNum
	 */
	public String getStockNum() {
		return stockNum;
	}

	/**
	 * @param stockNum
	 *            要设置的 stockNum
	 */
	public void setStockNum(String stockNum) {
		this.stockNum = stockNum;
	}
}