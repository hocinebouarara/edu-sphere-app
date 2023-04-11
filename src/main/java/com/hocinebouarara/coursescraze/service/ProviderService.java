package com.hocinebouarara.coursescraze.service;

import com.hocinebouarara.coursescraze.entity.Provider;
import com.hocinebouarara.coursescraze.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProviderService {

    @Autowired
    private ProviderRepository providerRepository;

    public Provider createProvider(Provider provider) {
        return providerRepository.save(provider);
    }

    public Provider updateProvider(Provider provider) {
        return providerRepository.save(provider);
    }

    public void deleteProviderById(Long id) {
        providerRepository.deleteById(id);
    }

    public Optional<Provider> getProviderById(Long id) {
        return providerRepository.findById(id);
    }

    public List<Provider> getAllProviders() {
        return providerRepository.findAll();
    }

}

