package com.example.key.model;

import io.hypersistence.utils.hibernate.id.Tsid;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;



import java.time.LocalDateTime;

import java.io.Serializable;
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public class BaseEntity implements Serializable {

    @Id
    @Tsid
    private String id;

    @CreationTimestamp
    protected LocalDateTime createdDate;


    @UpdateTimestamp
    protected LocalDateTime lastModifiedDate;




}
