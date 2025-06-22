package cl.ecommerce.ms_products_bff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MsProductsBffApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProductsBffApplication.class, args);
	}

}
