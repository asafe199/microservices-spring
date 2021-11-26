package com.master.consoleservices.model;

import lombok.*;
import org.hibernate.Hibernate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Data
@ToString
@Entity
@Table(name = "pwmb_devices", schema = "pwmb")
public class Devices {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "device_id", nullable = false)
    private Long id;

    @Column(name = "category")
    private String category;

    @Column(name = "os")
    private String os;

    @Column(name = "type")
    private String type;

    @DateTimeFormat
    @Column(name = "created_at")
    private Date createdAt;

    @DateTimeFormat
    @Column(name = "updated_at")
    private Date updateAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Devices devices = (Devices) o;
        return id != null && Objects.equals(id, devices.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
