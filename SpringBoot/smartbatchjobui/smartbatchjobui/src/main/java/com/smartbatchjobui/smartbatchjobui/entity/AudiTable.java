package com.smartbatchjobui.smartbatchjobui.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AudiTable {
    @CreatedDate
    @Column(name = "audit_create_date")
    private LocalDateTime createdDate =
            LocalDateTime.now();
    @LastModifiedDate
    @Column(name = "audit_update_date")
    private LocalDateTime lastModifiedDate =
            LocalDateTime.now();

    @Override
    public String toString() {
        return "AudiTable{" +
                "createdDate=" + createdDate +
                ", lastModifiedDate=" + lastModifiedDate +
                '}';
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}