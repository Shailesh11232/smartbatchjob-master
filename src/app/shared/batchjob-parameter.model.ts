export interface BatchjobParameter {
  batchJobId: number;
  parameterId: number;
  parameterName: String;
  parameterDescription: String;
  parameterType: String;
  parameterFormat: String;
  mandatoryFlag: Boolean;
  visibleFlag: Boolean;
  defaultValue: String;
  regexforValidation: String;
  /*
      batchJobParameterId: number;
      ParameterName: String;
      ParameterDescription: String;
      ParameterType: String;
      ParameterFormat: String;
      MandatoryFlag: Boolean;
      VisibleFlag: Boolean;
      DefaultValue: String;
      RegexforValidation: String;
  */
}
