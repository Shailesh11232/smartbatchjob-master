import { Component, Inject, OnInit } from '@angular/core';
import { NgModuleFactory } from '@angular/core/src/r3_symbols';
import { NgForm } from '@angular/forms';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { BatchjobParameter } from 'src/app/shared/batchjob-parameter.model';
import { BatchjobService } from 'src/app/shared/batchjob.service';

@Component({
  selector: 'app-batchjob-parameter',
  templateUrl: './batchjob-parameter.component.html',
  styleUrls: ['./batchjob-parameter.component.css'],
})
export class BatchjobParameterComponent implements OnInit {
  declare formData: BatchjobParameter;
  isValid: boolean = true;

  constructor(
    @Inject(MAT_DIALOG_DATA) public data: any,
    public dialogRef: MatDialogRef<BatchjobParameterComponent>,
    private batchJobSevice: BatchjobService
  ) {}

  ngOnInit(): void {
    if (this.data.batchJobParameterIndex == null) {
      console.log('batchJobParameterIndex is NULL - Add Called !');

      this.formData = {
        batchJobId: 0,
        parameterId: 0,
        parameterName: '',
        parameterDescription: '',
        parameterType: '',
        parameterFormat: '',
        mandatoryFlag: false,
        visibleFlag: false,
        defaultValue: '',
        regexforValidation: '',
      };
    } else {
      console.log('batchJobParameterIndex is NOT NULL - Edit Called !');
      this.formData = Object.assign(
        {},
        this.batchJobSevice.batchJobParameters[this.data.batchJobParameterIndex]
      );
    }
  }

  onSubmit(form: NgForm) {
    if (this.validateForm(form.value)) {
      if (this.data.batchJobParameterIndex == null) {
        console.log('batchJobParameterIndex is null');
        this.batchJobSevice.batchJobParameters.push(form.value);
      } else {
        this.batchJobSevice.batchJobParameters[
          this.data.batchJobParameterIndex
        ] = form.value;
        console.log('batchJobParameterIndex is NOT null');
      }
      this.dialogRef.close();
    }
  }
  updateparameter(batchJobId: number, parameterId: number) {
    this.batchJobSevice
      .updateBatchJob(batchJobId, parameterId)
      .subscribe((batchjobParameter: BatchjobParameter[]) => {
        this.batchJobSevice.batchJobParameters = batchjobParameter;
        console.log(
          'parameter update' + batchJobId + 'parameter' + parameterId
        );
      });
  }
  validateForm(formData: BatchjobParameter) {
    this.isValid = true;
    if (formData.parameterId == 0) this.isValid = false;
    else if (formData.parameterName.length <= 2) this.isValid = false;
    return this.isValid;
  }
}
