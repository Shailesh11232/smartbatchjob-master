import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { MatDialog } from '@angular/material/dialog';
import { MatDialogConfig } from '@angular/material/dialog';
import { ActivatedRoute, Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { BatchjobParameter } from 'src/app/shared/batchjob-parameter.model';
import { Batchjob } from 'src/app/shared/batchjob.model';
import { BatchjobService } from 'src/app/shared/batchjob.service';
import { BatchjobParameterComponent } from '../batchjob-parameter/batchjob-parameter.component';

@Component({
  selector: 'app-batchjob',
  templateUrl: './batchjob.component.html',
  styleUrls: ['./batchjob.component.css'],
})
export class BatchjobComponent implements OnInit {
  isValid: boolean = true;
  formData = [];
  batchJobParameters = [];

  constructor(
    public service: BatchjobService,
    private dialog: MatDialog,
    private router: Router,
    private currentRoute: ActivatedRoute,
    private toastr: ToastrService
  ) {}

  ngOnInit(): void {
    let batchJobId = this.currentRoute.snapshot.paramMap.get('id');
    if (batchJobId == null) {
      console.log('batchJobId is NULL ' + batchJobId);
      this.resetForm();
    } else {
      console.log('batchJobId is NOT NULL ' + batchJobId);

      // Will have to check the server side API response for a single batchjobID GET call.
      /* this.service.getBatchJobByID(parseInt(batchJobId))
          .then((res: { batchjob: Batchjob; batchjobDetails: BatchjobParameter[]; }) => {
            this.service.formData = res.batchjob;
            this.service.batchJobParameters = res.batchjobDetails;
            console.log("res = " + res);
  
          });
  */

      this.service
        .getBatchJobByID(Number(batchJobId))
        .subscribe(
          (batchjob: Batchjob, batchJobParameters: BatchjobParameter[]) => (
            ((this.service.formData = batchjob), batchjob.batchJobParameters),
            (this.service.batchJobParameters = batchJobParameters)
          )
        );
      this.service
        .getBatchJob(Number(batchJobId))
        .subscribe((batchjobParameter: BatchjobParameter[]) => {
          this.service.batchJobParameters = batchjobParameter;
        });
      console.log(this.service.formData.batchJobId);
    }
  }

  resetForm(form?: NgForm) {
    if (form) {
      form.resetForm();
    }
    this.service.formData = {
      batchJobId: 0,
      batchJobName: '',
      batchJobDescription: '',
      batchJobType: '',
      /*TODO */
      batchJobParameters: [],
      DeleteBatchJobIds: '',
    };

    this.service.batchJobParameters = [];
  }

  AddOrEditBatchJobParameter(batchJobParameterIndex: any, batchJobId: any) {
    const dialogConfig = new MatDialogConfig();
    dialogConfig.autoFocus = true;
    dialogConfig.disableClose = true;
    dialogConfig.width = '50%';
    dialogConfig.data = { batchJobParameterIndex, batchJobId };
    this.dialog
      .open(BatchjobParameterComponent, dialogConfig)
      .afterClosed()
      .subscribe((res) => {});
  }
  onDeleteBatchJobParameter(parameterId: number, i: number) {
    if (parameterId != null) {
      this.service.formData.DeleteBatchJobIds += parameterId + ',';
      console.log('delete table', parameterId);
      this.service.batchJobParameters.splice(i, 1);
    }
  }
  validateForm() {
    this.isValid = true;
    if (this.service.formData.batchJobId == 0) this.isValid = true;
    else if (this.service.formData.batchJobName.length <= 2)
      this.isValid = false;
    else if (this.service.formData.batchJobType == '0') this.isValid = false;
    else if (this.service.batchJobParameters.length == 0) this.isValid = false;

    return this.isValid;
  }

  onSubmit(form: NgForm) {
    if (this.validateForm()) {
      //this.toastr.success('Batch Job Submitted Successfully', 'SmartMicroBatchUI App.');

      this.service.saveOrUpdateOrder().subscribe((res) => {
        this.resetForm();
        this.toastr.success(
          'Batch Job Submitted Successfully',
          'SmartMicroBatchUI - App.'
        );
        this.router.navigate(['/batchjobs']);
      });
    }
  }
}
