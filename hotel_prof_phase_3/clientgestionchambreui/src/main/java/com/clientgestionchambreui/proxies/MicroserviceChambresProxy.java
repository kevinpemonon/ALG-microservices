package com.clientgestionchambreui.proxies;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.clientgestionchambreui.beans.ChambreBean;

import java.util.List;
import java.util.Optional;

//@FeignClient(name = "microservice-chambre", url = "localhost:9001")
@FeignClient(name = "microservice-chambre")
@RibbonClient(name = "microservice-chambre")
public interface MicroserviceChambresProxy {
	
	@GetMapping(value = "/chambres")
	List<ChambreBean> listeDesChambres();

	@GetMapping( value = "/chambres/{num}")
	ChambreBean recupererUneChambre(@PathVariable("num") int num);
	
	@PutMapping(value = "/chambres")
    public void updateChambre(@RequestBody ChambreBean chambre);


}
