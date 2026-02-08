package com.hal.hal.controller;

import com.hal.hal.dto.ComponentRequest;
import com.hal.hal.dto.ComponentResponse;
import com.hal.hal.model.Component;
import com.hal.hal.service.ComponentService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/component")
public class ComponentController {

    private final ComponentService service;

    public ComponentController(ComponentService service) {
        this.service = service;
    }

    @PostMapping("/generate")
    public ComponentResponse generate(@RequestBody ComponentRequest request) {
        return service.saveComponent(request);
    }

    @GetMapping("/{id}")
    public Component getComponent(@PathVariable Long id) {
        return service.getComponent(id);
    }
}