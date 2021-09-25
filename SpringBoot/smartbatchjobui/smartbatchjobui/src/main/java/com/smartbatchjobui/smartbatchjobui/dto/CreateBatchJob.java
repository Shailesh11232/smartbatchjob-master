package com.smartbatchjobui.smartbatchjobui.dto;

import java.util.List;

public class CreateBatchJob {
    private Long batchJobId ;
    private String batchJobName;
    private String batchJobDescription ;
    private String batchJobType ;
    private List<CreateBatchJobParameter> createBatchJobParameter ;

    @Override
    public String toString() {
        return "CreateBatchJob{" +
                "batchJobId=" + batchJobId +
                ", batchJobName='" + batchJobName + '\'' +
                ", batchJobDescription='" + batchJobDescription + '\'' +
                ", batchJobType='" + batchJobType + '\'' +
                ", createBatchJobParameter=" + createBatchJobParameter +
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

    public List<CreateBatchJobParameter> getCreateBatchJobParameter() {
        return createBatchJobParameter;
    }

    public void setCreateBatchJobParameter(List<CreateBatchJobParameter> createBatchJobParameter) {
        this.createBatchJobParameter = createBatchJobParameter;
    }
}