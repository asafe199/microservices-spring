package com.master.consoleservices.controller;

import com.master.consoleservices.model.Devices;
import com.master.consoleservices.services.interfaces.DeviceService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("device")
@AllArgsConstructor
public class DeviceController {

    private DeviceService deviceService;

    @GetMapping
    public ResponseEntity<List<Devices>> data(){
        return ResponseEntity.ok(deviceService.getAll());
    }
}
