package cl.ecommerce.ms_sales_bs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MsSalesBsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSalesBsApplication.class, args);
	}

}
