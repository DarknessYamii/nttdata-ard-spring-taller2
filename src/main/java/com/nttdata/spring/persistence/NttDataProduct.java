package com.nttdata.spring.persistence;
/**
 * Product Class
 * @author DarknessYamii
 *
 */
public class NttDataProduct {
	private Long productId;
	private String productName;
	private Double pvpPrice, noTaxPrice;

	/**
	 * @return the productId
	 */
	public Long getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the pvpPrice
	 */
	public Double getPvpPrice() {
		return pvpPrice;
	}
	/**
	 * @param pvpPrice the pvpPrice to set
	 */
	public void setPvpPrice(Double pvpPrice) {
		this.pvpPrice = pvpPrice;
	}
	/**
	 * @return the noTaxPrice
	 */
	public Double getNoTaxPrice() {
		return noTaxPrice;
	}
	/**
	 * @param noTaxPrice the noTaxPrice to set
	 */
	public void setNoTaxPrice(Double noTaxPrice) {
		this.noTaxPrice = noTaxPrice;
	}
	
	@Override
	public String toString() {
		return "NttDataProduct [productId=" + productId + ", productName=" + productName + ", pvpPrice=" + pvpPrice
				+ ", noTaxPrice=" + noTaxPrice + "]";
	}
}
