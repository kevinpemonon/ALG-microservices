package com.mpaiement.proxies;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mpaiement.beans.ChambreBean;



//@FeignClient(name = "microservice-chambre", url = "localhost:8701")
@FeignClient(name = "microservice-chambre")
@RibbonClient(name = "microservice-chambre")
public interface MicroserviceChambresProxy {
	
	@PutMapping(value = "/chambres/{num}")
    public void updateCommande(@RequestBody ChambreBean chambre, @PathVariable("num") int num);

	@GetMapping( value = "/chambres/{num}")
	ChambreBean recupererUneChambre(@PathVariable("num") int num);


}
