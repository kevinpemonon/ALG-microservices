package com.clientgestionchambreui.proxies;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.clientgestionchambreui.beans.ChambreBean;
import com.clientgestionchambreui.beans.ReservationBean;

/* TODO */

//@FeignClient(name = "microservice-reservation", url = "localhost:9002")
@FeignClient(name = "microservice-reservation")
@RibbonClient(name = "microservice-reservation")
public interface MicroserviceReservationsProxy {

	@GetMapping( value = "/reservations/{num}")
		ReservationBean recupererUneReservation(@PathVariable("num") int num);
	
	@PostMapping(value = "/reservations")
	    ReservationBean payerUneReservation(@RequestBody ReservationBean reservation);
	 
	@PutMapping(value = "/reservations/{id}")
	    ReservationBean updateUneReservation(@RequestBody ReservationBean reservation, @PathVariable("id") int id);

}
