import { BatchjobParameter } from "./batchjob-parameter.model";

export interface Batchjobmaster {
    batchJobId: Number;
    batchJobName: String;
    batchJobDescription: String;
    batchJobType: String;
    batchJobParameters: BatchjobParameter[];
    DeleteBatchJobIds: String;


}