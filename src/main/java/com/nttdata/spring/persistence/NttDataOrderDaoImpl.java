package com.nttdata.spring.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
/**
 * Dao Implement
 * @author DarknessYamii
 *
 */
@Repository
public class NttDataOrderDaoImpl implements NttDataOrderDaoI {

	private List<NttDataOrder> orders;
	
	public NttDataOrderDaoImpl() {
		orders = new ArrayList<NttDataOrder>();
	}
	
	@Override
	public void insert(NttDataOrder newOrder) {
	orders.add(newOrder);
		
	}
	/**
	 * Get all orders
	 * @return
	 */
	public List<NttDataOrder> getOrders(){
		return orders;
	}

}
