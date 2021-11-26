package com.master.consoleservices.repository;

import com.master.consoleservices.model.Devices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<Devices, Long> {

}
