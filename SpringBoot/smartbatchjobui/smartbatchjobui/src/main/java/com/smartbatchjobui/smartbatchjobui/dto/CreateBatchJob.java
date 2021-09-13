package com.smartbatchjobui.smartbatchjobui.dto;

import java.util.List;

public class CreateBatchJob {
    private Long id ;
    private String batchJobName;
    private String batchJobDescription ;
    private String batchJobType ;
    private List<CreateBatchJobParameter> createBatchJobParameter ;

    public CreateBatchJob() {
    }
    public CreateBatchJob(Long id, String batchJobName, String batchJobDescription, String batchJobType, List<CreateBatchJobParameter> createBatchJobParameter) {
        this.id = id;
        this.batchJobName = batchJobName;
        this.batchJobDescription = batchJobDescription;
        this.batchJobType = batchJobType;
        this.createBatchJobParameter = createBatchJobParameter;
    }

    @Override
    public String toString() {
        return "CreateBatchJob{" +
                "id=" + id +
                ", batchJobName='" + batchJobName + '\'' +
                ", batchJobDescription='" + batchJobDescription + '\'' +
                ", batchJobType='" + batchJobType + '\'' +
                ", createBatchJobParameter=" + createBatchJobParameter +
                '}';
    }
    public Long getId () {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<CreateBatchJobParameter> getCreateBatchJobParameter() {
        return createBatchJobParameter;
    }

    public void setCreateBatchJobParameter(List<CreateBatchJobParameter> createBatchJobParameter) {
        this.createBatchJobParameter = createBatchJobParameter;
    }






}