package com.nttdata.spring.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nttdata.spring.persistence.NttDataOrder;
import com.nttdata.spring.persistence.NttDataProduct;
/*
 * Implementacion Servicio Peninsula 
 */
@Service
@Qualifier("peninsula")
public class NttDataPeninsulaOrderServiceImpl extends NttDataOrderManagementServiceAbstract {
/*
 * Get order if u are living in the peninsula
 */
	@Override
	public void addOrder(NttDataOrder order, NttDataProduct... products) {
		List<NttDataProduct> productList = Arrays.asList(products);
		productList.forEach(product	-> product.setPvpPrice(product.getNoTaxPrice() * (1 + 0.21)));
		order.setProducts(productList);
		orderBBDD.insert(order);
		
	}

}
