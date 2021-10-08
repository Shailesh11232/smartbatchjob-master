import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { environment } from 'src/environments/environment';

import { Batchjob } from './batchjob.model';
import { BatchjobParameter } from './batchjob-parameter.model';

@Injectable({
  providedIn: 'root',
})
export class BatchjobService {
  declare formData: Batchjob;
  declare batchJobParameters: BatchjobParameter[];
  //declare masterData: batchjobMaster;

  constructor(private http: HttpClient) {}

  saveOrUpdateOrder() {
    var body = {
      batchJobId: this.formData.batchJobId,
      batchJobName: this.formData.batchJobName,
      batchJobDescription: this.formData.batchJobDescription,
      batchJobType: this.formData.batchJobType,
      createBatchJobParameter: this.batchJobParameters,
    };

    return this.http.post(
      environment.apiURL + '/cbj',
      body,
      this.generateHeaders()
    );
  }

  private generateHeaders = () => {
    return {
      headers: new HttpHeaders({ 'Content-Type': 'application/json' }),
    };
  };

  getBatchJobList() {
    return this.http.get<Batchjob[]>(environment.apiURL + '/cbj/allGet');
  }

  getBatchJobByID(batchJobId: number): any {
    /* return this.http
      .get (environment.apiURL + '/batchData/' + batchJobId)
      .toPromise();
      */
    return this.http.get<Batchjob[]>(
      environment.apiURL + '/batchData/' + batchJobId
    );
  }
  getBatchJob(createBatchJobId: number): any {
    return this.http.get<BatchjobParameter[]>(
      environment.apiURL + '/cbj/' + createBatchJobId
    );
  }

  deleteBatchJob(batchJobId: number) {
    return this.http
      .delete(environment.apiURL + '/BatchJobDelete/' + batchJobId)
      .toPromise();
  }
  updateBatchJob(batchJobId: number, parameterId: number) {
    return this.http.get<BatchjobParameter[]>(
      environment.apiURL +
        'PutParameter' +
        batchJobId +
        'parameter' +
        parameterId
    );
  }
  /* deletebatchJobParameter(id: number) {
    this.http
      .delete('http://localhost:8080/api/ParameterDelete/' + id)
      .subscribe(() => {
        console.log('Deleted' + id);
      });
  }*/
}
