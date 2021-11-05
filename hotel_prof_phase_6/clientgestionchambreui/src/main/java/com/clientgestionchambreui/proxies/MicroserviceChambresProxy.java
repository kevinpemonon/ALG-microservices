package com.clientgestionchambreui.proxies;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.clientgestionchambreui.beans.ChambreBean;

import java.util.List;

@FeignClient(name = "zuul-server",url="localhost:9004")
public interface MicroserviceChambresProxy {
	
	@GetMapping(value = "chambres")
	List<ChambreBean> listeDesChambres();

	@GetMapping( value = "chambres/{num}")
	ChambreBean recupererUneChambre(@PathVariable("num") int num);
	
	@PutMapping(value = "chambres/{num}")
    public void updateCommande(@RequestBody ChambreBean chambre,@PathVariable("num") int num);

	
	/*@GetMapping(value = "microservice-chambre/chambres")
	List<ChambreBean> listeDesChambres();

	@GetMapping( value = "microservice-chambre/chambres/{num}")
	ChambreBean recupererUneChambre(@PathVariable("num") int num);
	
	@PutMapping(value = "microservice-chambre/chambres/{num}")
    public void updateCommande(@RequestBody ChambreBean chambre,@PathVariable("num") int num);*/


}
