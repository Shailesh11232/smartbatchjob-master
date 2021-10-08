import { BatchjobParameter } from './batchjob-parameter.model';

export interface Batchjob {
  batchJobId: Number;
  batchJobName: String;
  batchJobDescription: String;
  batchJobType: String;
  batchJobParameters: BatchjobParameter[];
  DeleteBatchJobIds: String;
}
/*export interface Batchjobtemp {
    id: Number;
    batchJobName: String;
    batchJobDescription: String;
    batchJobType: String;
    DeleteBatchJobIds: String;

}*/
