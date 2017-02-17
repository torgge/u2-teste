package com.datapar.update2.service;

import com.datapar.update2.domain.Artifactory;

import java.util.Collection;

public interface ArtifactoryService {

    Artifactory findByCodigo(Long codigo);

    Collection<Artifactory> findAll();

    Artifactory create(Artifactory artifactory);

    Artifactory update(Artifactory artifactory);

    void delete(Artifactory artifactory);
}
