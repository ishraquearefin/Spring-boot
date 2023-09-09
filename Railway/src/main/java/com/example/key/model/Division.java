package com.example.key.model;

import jakarta.persistence.Entity;

import jakarta.persistence.EntityListeners;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@EntityListeners(AuditingEntityListener.class)
@Data
public class Division extends BaseEntity{
    private String name;
}
