package com.nttdata.spring.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nttdata.spring.persistence.NttDataOrder;
import com.nttdata.spring.persistence.NttDataProduct;
/*
 * Implementacion Servicio no peninsula
 */
@Service
@Qualifier("noPeninsula")
public class NttDataNoPeninsulaOrderServiceImpl extends NttDataOrderManagementServiceAbstract {
	/*
	 * Get order if u are not living in the peninsula
	 */
	@Override
	public void addOrder(NttDataOrder order, NttDataProduct... products) {
		List<NttDataProduct> productList = Arrays.asList(products);
		productList.forEach(product	-> product.setPvpPrice(product.getNoTaxPrice() * (1 + 0.04)));
		order.setProducts(productList);
		orderBBDD.insert(order);
	}
}
		
