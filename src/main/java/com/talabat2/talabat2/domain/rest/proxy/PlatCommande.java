/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.rest.proxy;

import com.talabat2.talabat2.domain.rest.vo.exchange.PlatCommandeVo;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author wadie
 */
@FeignClient(name = "microservice1-talabat1", url = "localhost:8099")
public interface PlatCommande {

    @GetMapping("talabat1/platCommandes/reference/{reference}")
    public List<PlatCommandeVo> findPlatCommmandeByReference(@PathVariable String reference);

}
