package com.clientgestionchambreui.proxies;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.clientgestionchambreui.beans.ReservationBean;

/* TODO */

@FeignClient(name = "zuul-server")
@RibbonClient(name = "microservice-reservation")
public interface MicroserviceReservationsProxy {
	
	 @PostMapping(value = "microservice-reservation/reservations")
	    ReservationBean payerUneReservation(@RequestBody ReservationBean reservation);

}
