package com.liveasy.controller;

import com.liveasy.model.Transporter;
import com.liveasy.service.TransporterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/transporters")
public class TransporterController {

    @Autowired
    private TransporterService transporterService;

    @GetMapping
    public List<Transporter> getAllTransporters() {
        return transporterService.getAllTransporters();
    }
}
