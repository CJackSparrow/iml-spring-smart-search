package com.demo.springsearch;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class FunctionEntity extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "note")
    private String note;
}
