package com.datapar.update2.service.impl;

import com.datapar.update2.domain.Artifactory;
import com.datapar.update2.repository.ArtifactoryRepository;
import com.datapar.update2.service.ArtifactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ArtifactoryServiceImpl implements ArtifactoryService {

    @Autowired
    private ArtifactoryRepository repository;

    @Override
    public Artifactory findByCodigo(Long codigo) {
        return repository.findOne(codigo);
    }

    @Override
    public Collection<Artifactory> findAll() {
        return (Collection<Artifactory>) repository.findAll();
    }

    @Override
    public Artifactory create(Artifactory artifactory) {
        return repository.save(artifactory);
    }

    @Override
    public Artifactory update(Artifactory artifactory) {
        return repository.save(artifactory);
    }

    @Override
    public void delete(Artifactory artifactory) {
        repository.delete(artifactory);
    }
}
