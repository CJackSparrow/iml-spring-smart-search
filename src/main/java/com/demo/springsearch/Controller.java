package com.demo.springsearch;

import com.sipios.springsearch.anotation.SearchSpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/permission")
public class Controller {
    private final PermissionRepository permissionRepository;

    @Autowired
    public Controller(PermissionRepository permissionRepository) {
        this.permissionRepository = permissionRepository;
    }


    @GetMapping
    public ResponseEntity search(@SearchSpec Specification<PermissionEntity> specs){
        return ResponseEntity.ok(permissionRepository.findAll(Specification.where(specs)));
    }
}
