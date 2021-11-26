package com.master.consoleservices.services.impl;

import com.master.consoleservices.model.Devices;
import com.master.consoleservices.repository.DeviceRepository;
import com.master.consoleservices.services.interfaces.DeviceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DeviceServiceImpl implements DeviceService {

    private final DeviceRepository deviceRepository;

    @Override
    public List<Devices> getAll() {
        List<Devices> all = deviceRepository.findAll();
        return all;
    }
}
