package com.clientgestionchambreui.proxies;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.clientgestionchambreui.beans.ReservationBean;

/* TODO */

@FeignClient(name = "microservice-reservation", url = "localhost:9002")
public interface MicroserviceReservationsProxy {
	
	 @PostMapping(value = "/reservations")
	    ReservationBean payerUneReservation(@RequestBody ReservationBean reservation);

}
