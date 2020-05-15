package com.learninghub.onlinequiz.ExtendClass;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt","updatedAt","createdBy","updatedBy"},allowGetters = true)



public abstract class AdminTracker {
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at",nullable = false,updatable=false)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at",nullable=false)
    @LastModifiedDate
    private Date updatedAt;

    @Column(name =  "created_by",nullable = false)
    @CreatedBy
    private  String createdBy;

    @Column(name = "updated_by",nullable = false)
    @CreatedBy
    private  String updatedBy;


    public AdminTracker(){

    }

    public AdminTracker(Date createdAt, Date updatedAt, String createdBy, String updatedBy) {
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
