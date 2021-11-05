package com.clientgestionchambreui.proxies;



import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.clientgestionchambreui.beans.PaiementBean;

/* TODO */

@FeignClient(name = "zuul-server")
@RibbonClient(name = "microservice-paiement")
public interface MicroservicePaiementProxy {

    @PostMapping(value = "microservice-paiement/paiement")
    ResponseEntity<PaiementBean> payerUneReservation(@RequestBody PaiementBean paiement);

}