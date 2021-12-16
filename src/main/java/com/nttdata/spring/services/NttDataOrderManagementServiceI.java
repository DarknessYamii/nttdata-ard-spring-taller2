package com.nttdata.spring.services;

import java.util.List;

import com.nttdata.spring.persistence.NttDataOrder;
import com.nttdata.spring.persistence.NttDataProduct;

public interface NttDataOrderManagementServiceI {

	public void addOrder(NttDataOrder order, NttDataProduct... products);

	public List<NttDataOrder> searchAll();
}
