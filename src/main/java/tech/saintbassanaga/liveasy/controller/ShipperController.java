package tech.saintbassanaga.liveasy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import tech.saintbassanaga.liveasy.entity.Shipper;
import tech.saintbassanaga.liveasy.services.ShipperService;

@RestController
@RequestMapping(name="shipper")
public class ShipperController {

    private final ShipperService shipperService;

    public ShipperController(ShipperService shipperService) {
        this.shipperService = shipperService;
    }

    @PostMapping(value = "create", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public String createShipper( @RequestBody Shipper shipper){
        return shipperService.createShipper(shipper);
    }
}
