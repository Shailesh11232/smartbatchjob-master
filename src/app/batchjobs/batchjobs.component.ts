import { Component, OnInit } from '@angular/core';
import { Batchjob } from '../shared/batchjob.model';
import { BatchjobService } from '../shared/batchjob.service';
import { ActivatedRoute, Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';


@Component({
  selector: 'app-batchjobs',
  templateUrl: './batchjobs.component.html',
  styleUrls: ['./batchjobs.component.css']
})
export class BatchjobsComponent implements OnInit {

  declare batchJobList: Batchjob[];


  constructor(
    private service: BatchjobService,
    private router: Router,
    private toastr: ToastrService,
    private currentRoute: ActivatedRoute

  ) { }

  ngOnInit(): void {
    //  this.service.getBatchJobList().subscribe(data => this.batchJobList = data);
    this.refreshList();
  }
  refreshList() {
    this.service
      .getBatchJobList()
      .subscribe((data) => (this.batchJobList = data));
  }
  //  this.http.get('http://localhost:8080/api/cbj/' + t.id).subscribe(

  openForEdit(batchJobId: any) {
    this.router.navigate(['/batchjob/' + batchJobId])
  }

  // onOrderDelete(batchJobId: any) {
  //this.http.get('http://localhost:8080/api/BatchJobDelete/' + batchJobId.id);

  //}
  onOrderDelete(batchJobId: any) {
    if (confirm('Are you sure to delete this record?')) {
      this.service.deleteBatchJob(batchJobId).then((res) => {
        this.refreshList();
        this.toastr.warning('Deleted Successfully', 'smartbatchjob ');
      });
    }
  }
}
