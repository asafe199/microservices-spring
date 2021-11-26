package com.master.consoleservices.services.interfaces;

import com.master.consoleservices.model.Devices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeviceService {
    List<Devices> getAll();
}
