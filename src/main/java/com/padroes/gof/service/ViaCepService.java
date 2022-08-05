package com.padroes.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.padroes.gof.model.AddressCustomer;

/*
 * Client HTTP, criado via <b>OpenFeign</b>, para o consummo da <b>API ViaCEP</b>.
 * 
 *  @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign</a>
 */

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

	@GetMapping("/{cep}/json/")
	AddressCustomer findByCep(@PathVariable("cep") String cep);
	
}
