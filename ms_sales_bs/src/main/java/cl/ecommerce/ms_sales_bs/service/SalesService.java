package cl.ecommerce.ms_sales_bs.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.ecommerce.ms_sales_bs.clients.SalesDbFeignClient;
import cl.ecommerce.ms_sales_bs.model.dto.SalesDTO;

@Service
public class SalesService {

    @Autowired
    SalesDbFeignClient salesDbFeignClient;

    public List<SalesDTO> selectAllSales() {
        return salesDbFeignClient.selectAllSales();
    }

    public SalesDTO saveOrUpdateSales(SalesDTO salesDTO) {
        return salesDbFeignClient.saveOrUpdateSales(salesDTO);
    }

    public void deleteSales(Long id) {
        salesDbFeignClient.deleteSales(id);
    }

    public SalesDTO getSalesById(Long id) {
        return salesDbFeignClient.getSalesById(id);
    }

}
