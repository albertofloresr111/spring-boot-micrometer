package com.bitacora.it.micrometer.controller;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ventas")
public class TiendaOnlineController {

    @Timed(
            value = "bitacora.deportes.request1",
            histogram = true,
            percentiles = {0.95,0.99},
            extraTags ={"version","1.0"}
    )
    @GetMapping("/balones")
    public String venderBalones()  {
        return "Un artículo Deportivo vendido";
    }

    @Timed(
            value = "bitacora.computacion.request2",
            histogram = true,
            percentiles = {0.95,0.99},
            extraTags ={"version","1.0"}
    )
    @GetMapping("/mause")
    public String venderMause()  {
        return "Artículo de Computacion vendido";
    }

    @Timed(
            value = "bitacora.computacion.request2",
            histogram = true,
            percentiles = {0.95,0.99},
            extraTags ={"version","1.0"}
    )
    @GetMapping("/laptop")
    public String venderLaptop()  {
        return "Artículo de Computacion vendido";
    }

}
