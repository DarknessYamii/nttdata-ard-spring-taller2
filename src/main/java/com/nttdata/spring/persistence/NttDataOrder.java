package com.nttdata.spring.persistence;

import java.util.List;
/**
 * Order Class
 * @author DarknessYamii
 *
 */
public class NttDataOrder {

	private Long orderId;
	private String receiver, address;
	private Boolean peninsula;
	private List<NttDataProduct> products;
	/**
	 * @return the orderId
	 */
	public Long getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return the receiver
	 */
	public String getReceiver() {
		return receiver;
	}
	/**
	 * @param receiver the receiver to set
	 */
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * @return the peninsula
	 */
	public Boolean getPeninsula() {
		return peninsula;
	}
	/**
	 * @param peninsula the peninsula to set
	 */
	public void setPeninsula(Boolean peninsula) {
		this.peninsula = peninsula;
	}
	/**
	 * @return the products
	 */
	public List<NttDataProduct> getProducts() {
		return products;
	}
	/**
	 * @param products the products to set
	 */
	public void setProducts(List<NttDataProduct> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "NttDataOrder [orderId=" + orderId + ", receiver=" + receiver + ", address=" + address + ", noIva="
				+ peninsula + ", products=" + products + "]";
	}
}
