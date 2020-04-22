package com.javaprogramto.bean.scopes.beanscopes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PaymentRunner implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private PaymentService service1;

	@Autowired
	private PaymentService service2;

	@Override
	public void run(String... args) throws Exception {
		logger.info("service1 hashcode " + service1.hashCode());
		service1.setAmount(100l);
		service1.setPaymentStatus("success");

		logger.info("service2 hashcode " + service2.hashCode());
		logger.info("service2 amount " + service2.getAmount());
		logger.info("service2 status " + service2.getPaymentStatus());

	}

}
