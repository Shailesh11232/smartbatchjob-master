package com.smartbatchjobui.smartbatchjobui.resources;

import com.smartbatchjobui.smartbatchjobui.dto.CreateBatchJob;
import com.smartbatchjobui.smartbatchjobui.dto.CreateBatchJobParameter;
import com.smartbatchjobui.smartbatchjobui.services.CreateBatchJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
@SpringBootApplication
//@CrossOrigin("*")
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api")
public class CreateBatchJobResources {

    @Autowired
    private CreateBatchJobService createBatchJobService;

      @PostMapping("cbj")
      ResponseEntity<CreateBatchJob>  CreateBJob(@RequestBody CreateBatchJob createBatchJob){
          System.out.println("CreateBatchJob:"+createBatchJob);
          CreateBatchJob createBatchJobResult =
                  createBatchJobService.CreateBJob(createBatchJob);
          URI location =
                  ServletUriComponentsBuilder.fromCurrentRequestUri()
                          .path("{/id}").buildAndExpand(createBatchJobResult).toUri();
          return ResponseEntity.created(location).body(createBatchJobResult);
    }
    @PutMapping("/UpdateParameter/{id}")
    ResponseEntity<CreateBatchJobParameter> UpdateParameter(@RequestBody CreateBatchJobParameter createBatchJobParameter,
                                                             @PathVariable("id")Long id){
        System.out.println("CreateBatchJobParameter:"+createBatchJobParameter);
        CreateBatchJobParameter createBatchJobParameterResult =
                createBatchJobService.UpadetParameter(createBatchJobParameter, id);
        URI location =
                ServletUriComponentsBuilder.fromCurrentRequestUri()
                        .path("{/id}").buildAndExpand(createBatchJobParameterResult).toUri();
        return ResponseEntity.created(location).body(createBatchJobParameterResult);
    }
    @GetMapping("/cbj/{createBatchJobId}")
    ResponseEntity<List<CreateBatchJobParameter>> getIdBatchJob(@PathVariable(
            "createBatchJobId")Long createBatchJobId){
        System.out.println("CreateBatchJobId:"+createBatchJobId);
        List<CreateBatchJobParameter> createBatchJobParametersResult =
                createBatchJobService.getIdBatchJob(createBatchJobId);
        return ResponseEntity.ok().body(createBatchJobParametersResult);
    }
    @GetMapping( "/cbj/allGet")
    ResponseEntity<List<CreateBatchJob>> allGet() {
        List<CreateBatchJob> createBatchJobResult =
                createBatchJobService.getAllBatchJob();
        return ResponseEntity.ok().body(createBatchJobResult);
    }

    @DeleteMapping("BatchJobDelete/{BatchJobId}")
    void DeleteParameter(@PathVariable("BatchJobId")Long BatchJobId){
        createBatchJobService.deletByBatchJobId(BatchJobId);
    }

    void  DeleteBatchJob(@PathVariable("BatchJobId")Long BatchJobId){
        createBatchJobService.deletByBatchJobId(BatchJobId);
    }

}