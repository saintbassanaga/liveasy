package tech.saintbassanaga.liveasy.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.saintbassanaga.liveasy.dtos.PayLoadDto;
import tech.saintbassanaga.liveasy.entity.PayLoad;
import tech.saintbassanaga.liveasy.services.PayLoadService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "load")
public class PayLoadController {
    private final PayLoadService payLoadService;

    public PayLoadController(PayLoadService payLoadService) {
        this.payLoadService = payLoadService;
    }

    @GetMapping(value = "{loaId}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public PayLoadDto findLoad(@PathVariable UUID loaId) {
        return payLoadService.findById(loaId);
    }

    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public String createLoad(@RequestBody PayLoad payLoad) {
        return payLoadService.createLoad(payLoad);
    }


    @GetMapping(value = "{shipperId}")
    @ResponseStatus(HttpStatus.OK)
    public List<PayLoadDto> payLoadList(@PathVariable UUID shipperId) {
        return payLoadService.payLoadList(shipperId);
    }

    @PutMapping(value = "{loadId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<PayLoad> update(@PathVariable UUID loadId, @RequestBody PayLoadDto payLoad) {
        return ResponseEntity.ok(payLoadService.updatePayLoad(loadId, payLoad));
    }

    @DeleteMapping(value = "{loadId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String delete(@PathVariable(value = "loadId") UUID uuid) {
        payLoadService.deletePayLoad(uuid);
        return "Payload Deleted Successfully !";
    }
}
