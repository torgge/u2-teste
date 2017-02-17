package com.datapar.update2.controller;

import com.datapar.update2.domain.Artifactory;
import com.datapar.update2.service.ArtifactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by george.bonespirito on 17/02/2017.
 */
@RestController
@RequestMapping(value = "/api/vi/artifactory", produces = MediaType.APPLICATION_JSON_VALUE)
public class ArtifactoryController {

    @Autowired
    private ArtifactoryService service;

    @RequestMapping(value = "/{codigo}", method = RequestMethod.GET)
    public Artifactory get(@PathVariable Long codigo){
        return service.findByCodigo(codigo);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Artifactory> getAll(){
        return service.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Artifactory create(@RequestBody Artifactory artifactory){
        return service.create(artifactory);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Artifactory update(@RequestBody Artifactory artifactory){
        return service.update(artifactory);
    }

    @RequestMapping(method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void delete(Long codigo){
        Artifactory artifactory = service.findByCodigo(codigo);
        service.delete(artifactory);
    }
}