package com.mpaiement.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mpaiement.beans.ChambreBean;



@FeignClient(name = "microservice-chambre", url = "localhost:9001")
public interface MicroserviceChambresProxy {
	
	@PutMapping(value = "/chambres")
    public void updateCommande(@RequestBody ChambreBean chambre);

	@GetMapping( value = "/chambres/{num}")
	ChambreBean recupererUneChambre(@PathVariable("num") int num);


}
