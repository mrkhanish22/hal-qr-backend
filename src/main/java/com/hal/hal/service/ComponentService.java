package com.hal.hal.service;

import com.hal.hal.dto.ComponentRequest;
import com.hal.hal.dto.ComponentResponse;
import com.hal.hal.model.Component;
import com.hal.hal.repository.ComponentRepository;
import org.springframework.stereotype.Service;

@Service
public class ComponentService {

    private final ComponentRepository repository;

    public ComponentService(ComponentRepository repository) {
        this.repository = repository;
    }

    public ComponentResponse saveComponent(ComponentRequest request) {

        Component component = new Component();
        component.setPartNumber(request.getPartNumber());
        component.setSerialNumber(request.getSerialNumber());
        component.setBatchNumber(request.getBatchNumber());
        component.setManufacturingType(request.getManufacturingType());
        component.setExpiry(request.getExpiry());

        Component saved = repository.save(component);

        ComponentResponse response = new ComponentResponse();
        response.id = saved.getId();
        response.qrUrl = "http://127.0.0.1:5500/second.html?id=" + saved.getId();

        return response;
    }

    public Component getComponent(Long id) {
        return repository.findById(id).orElse(null);
    }
}