/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layerd.service.customer;

import pos.layerd.dto.CustomerDto;
import pos.layerd.service.SuperService;

/**
 *
 * @author BIMSARA
 */
public interface CustomerService extends SuperService {
    String addCustomer(CustomerDto customerDto) throws Exception;
}
