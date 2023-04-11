package com.hocinebouarara.coursescraze.controller;

import com.hocinebouarara.coursescraze.entity.Provider;
import com.hocinebouarara.coursescraze.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/providers")
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @GetMapping
    public List<Provider> getAllProviders() {
        return providerService.getAllProviders();
    }

    @GetMapping("/{id}")
    public Optional<Provider> getProviderById(@PathVariable Long id) {
       return providerService.getProviderById(id);
    }

    @PostMapping
    public ResponseEntity<Provider> createProvider(@RequestBody Provider provider) {
        Provider savedProvider = providerService.createProvider(provider);
        return ResponseEntity.created(URI.create("/api/providers/" + savedProvider.getId())).body(savedProvider);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Provider> updateProvider(@PathVariable Long id, @RequestBody Provider provider) {
        provider.setId(id);
        Provider updatedProvider = providerService.updateProvider(provider);
        if (updatedProvider != null) {
            return ResponseEntity.ok(updatedProvider);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public void deleteProvider(@PathVariable Long id) {
       providerService.deleteProviderById(id);
    }

}

