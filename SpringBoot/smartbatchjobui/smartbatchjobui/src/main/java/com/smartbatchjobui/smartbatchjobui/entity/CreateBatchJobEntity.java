package com.smartbatchjobui.smartbatchjobui.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity(name = "batch_job")
@EntityListeners(AuditingEntityListener.class)
public class CreateBatchJobEntity extends AudiTable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Batch_job_id")
    private Long batchJobId ;
    @Column(name = "Batch_Job_Name")
    private String batchJobName;
    @Column(name = "Batch_Job_Description")
    private String batchJobDescription ;
    @Column(name = "Batch_Job_Type")
    private String batchJobType ;

    @Override
    public String toString() {
        return "CreateBatchJobEntity{" +
                "batchJobId=" + batchJobId +
                ", batchJobName='" + batchJobName + '\'' +
                ", batchJobDescription='" + batchJobDescription + '\'' +
                ", batchJobType='" + batchJobType + '\'' +
                '}';
    }

    public Long getId() {
        return batchJobId;
    }

    public void setId(Long id) {
        this.batchJobId = id;
    }

    public String getBatchJobName() {
        return batchJobName;
    }

    public void setBatchJobName(String batchJobName) {
        this.batchJobName = batchJobName;
    }

    public String getBatchJobDescription() {
        return batchJobDescription;
    }

    public void setBatchJobDescription(String batchJobDescription) {
        this.batchJobDescription = batchJobDescription;
    }

    public String getBatchJobType() {
        return batchJobType;
    }

    public void setBatchJobType(String batchJobType) {
        this.batchJobType = batchJobType;
    }
}