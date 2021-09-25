package com.smartbatchjobui.smartbatchjobui.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity(name = "batch_job_parameter")
@EntityListeners(AuditingEntityListener.class)
public class CreateBatchJobParameterEntity extends AudiTable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "batchJobParameterId")
    private Long batchJobParameterId;
    @Column(name = "batch_job_id")
    private Long createBatchJobId;
    @Column(name = "Parameter_Name")
    private String ParameterName ;
    @Column(name = "Parameter_Description")
    private String ParameterDescription ;
    @Column(name = "Parameter_Type")
    private String ParameterType ;
    @Column(name = "Parameter_Format")
    private String ParameterFormat ;
    @Column(name = "Mandatory_Flag")
    private Boolean MandatoryFlag ;
    @Column(name = "Visible_Flag")
    private Boolean VisibleFlag ;
    @Column(name = "Default_Value")
    private String DefaultValue ;
    @Column(name = "Regex_for_Validation")
    private String RegexforValidation ;

    @Override
    public String toString() {
        return "CreateBatchJobParameterEntity{" +
                "batchJobParameterId=" + batchJobParameterId +
                ", createBatchJobId=" + createBatchJobId +
                ", ParameterName='" + ParameterName + '\'' +
                ", ParameterDescription='" + ParameterDescription + '\'' +
                ", ParameterType='" + ParameterType + '\'' +
                ", ParameterFormat='" + ParameterFormat + '\'' +
                ", MandatoryFlag=" + MandatoryFlag +
                ", VisibleFlag=" + VisibleFlag +
                ", DefaultValue='" + DefaultValue + '\'' +
                ", RegexforValidation='" + RegexforValidation + '\'' +
                '}';
    }

    public Long getId() {
        return batchJobParameterId;
    }

    public void setId(Long id) {
        this.batchJobParameterId = id;
    }

    public Long getCreateBatchJobId() {
        return createBatchJobId;
    }

    public void setCreateBatchJobId(Long createBatchJobId) {
        this.createBatchJobId = createBatchJobId;
    }

    public String getParameterName() {
        return ParameterName;
    }

    public void setParameterName(String parameterName) {
        ParameterName = parameterName;
    }

    public String getParameterDescription() {
        return ParameterDescription;
    }

    public void setParameterDescription(String parameterDescription) {
        ParameterDescription = parameterDescription;
    }

    public String getParameterType() {
        return ParameterType;
    }

    public void setParameterType(String parameterType) {
        ParameterType = parameterType;
    }

    public String getParameterFormat() {
        return ParameterFormat;
    }

    public void setParameterFormat(String parameterFormat) {
        ParameterFormat = parameterFormat;
    }

    public Boolean getMandatoryFlag() {
        return MandatoryFlag;
    }

    public void setMandatoryFlag(Boolean mandatoryFlag) {
        MandatoryFlag = mandatoryFlag;
    }

    public Boolean getVisibleFlag() {
        return VisibleFlag;
    }

    public void setVisibleFlag(Boolean visibleFlag) {
        VisibleFlag = visibleFlag;
    }

    public String getDefaultValue() {
        return DefaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        DefaultValue = defaultValue;
    }

    public String getRegexforValidation() {
        return RegexforValidation;
    }

    public void setRegexforValidation(String regexforValidation) {
        RegexforValidation = regexforValidation;
    }
}