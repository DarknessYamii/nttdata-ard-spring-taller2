package com.nttdata.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nttdata.spring.persistence.NttDataOrder;
import com.nttdata.spring.persistence.NttDataOrderDaoImpl;
import com.nttdata.spring.persistence.NttDataProduct;
/**
 * Servicio abstracto para recoger addOrder dependiendo de Peninsular/NoPeninsular
 * searchAll para ambos 
 * @author DarknessYamii
 *
 */
public abstract class NttDataOrderManagementServiceAbstract implements NttDataOrderManagementServiceI{

	@Autowired
	public NttDataOrderDaoImpl orderBBDD;
/**
 * Abstract add a new order
 */
	@Override
	public abstract void addOrder(NttDataOrder order, NttDataProduct... products);
	
		
	/**
	 * 	Search all order
	 */
	@Override
	public List<NttDataOrder> searchAll() {
	return orderBBDD.getOrders();
	}
	
	
	
}
