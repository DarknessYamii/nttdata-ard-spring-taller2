package com.nttdata.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.persistence.NttDataOrder;
import com.nttdata.spring.persistence.NttDataProduct;
import com.nttdata.spring.services.NttDataNoPeninsulaOrderServiceImpl;
import com.nttdata.spring.services.NttDataPeninsulaOrderServiceImpl;
/**
 * Main Spring
 * @author DarknessYamii
 *
 */
@SpringBootApplication
public class NttDataSpringMain implements CommandLineRunner {

	/* Service Peninsula */
	@Autowired
	@Qualifier("peninsula")
	NttDataPeninsulaOrderServiceImpl pService;
	/* Service No Peninsula */
	@Autowired
	@Qualifier("noPeninsula")
	NttDataNoPeninsulaOrderServiceImpl nPService;
	
	public static void main(String[] args) {
		SpringApplication.run(NttDataSpringMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		NttDataOrder order1 = new NttDataOrder();
		order1.setOrderId(1L);
		order1.setPeninsula(true);
		order1.setAddress("Mi Corazon");
		order1.setReceiver("Andresito");
		NttDataOrder order2 = new NttDataOrder();
		order2.setOrderId(2L);
		order2.setPeninsula(true);
		order2.setAddress("Su Corazon");
		order2.setReceiver("Mari");
		NttDataOrder order3 = new NttDataOrder();
		order3.setOrderId(3L);
		order3.setPeninsula(true);
		order3.setAddress("Marbella");
		order3.setReceiver("Marco");
		NttDataProduct product1 = new NttDataProduct();
		product1.setProductId(1L);
		product1.setProductName("Mi amor por ella");
		product1.setNoTaxPrice(0.);
		NttDataProduct product2 = new NttDataProduct();
		product2.setProductId(2L);
		product2.setProductName("Su amor por mi");
		product2.setNoTaxPrice(200.50);
		NttDataProduct product3 = new NttDataProduct();
		product3.setProductId(3L);
		product3.setProductName("Monitor");
		product3.setNoTaxPrice(200.50);
		
		pService.addOrder(order1,product2 );
		pService.addOrder(order2, product1);
		nPService.addOrder(order3, product3);
		
		pService.searchAll().forEach(System.out::println);
	}

}
