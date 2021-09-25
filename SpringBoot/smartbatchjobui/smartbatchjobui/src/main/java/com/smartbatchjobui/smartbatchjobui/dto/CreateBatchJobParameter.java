package com.smartbatchjobui.smartbatchjobui.dto;

public class CreateBatchJobParameter {
    private Long batchJobParameterId;
    private String ParameterName ;
    private String ParameterDescription ;
    private String ParameterType ;
    private String ParameterFormat ;
    private Boolean MandatoryFlag ;
    private Boolean VisibleFlag ;
    private String DefaultValue ;
    private String RegexforValidation ;

    public CreateBatchJobParameter(){

    }
    public CreateBatchJobParameter(Long id, String parameterName, String parameterDescription, String parameterType, String parameterFormat, Boolean mandatoryFlag, Boolean visibleFlag, String defaultValue, String regexforValidation) {
        this.batchJobParameterId = batchJobParameterId;
        ParameterName = parameterName;
        ParameterDescription = parameterDescription;
        ParameterType = parameterType;
        ParameterFormat = parameterFormat;
        MandatoryFlag = mandatoryFlag;
        VisibleFlag = visibleFlag;
        DefaultValue = defaultValue;
        RegexforValidation = regexforValidation;
    }

    @Override
    public String toString() {
        return "createBatchJobParameter{" +
                "batchJobParameterId=" + batchJobParameterId +
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