package com.smartbatchjobui.smartbatchjobui.repositoris;

import com.smartbatchjobui.smartbatchjobui.entity.CreateBatchJobParameterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CreateBatchJobParameterRepository
        extends JpaRepository<CreateBatchJobParameterEntity,Long>{
        @Transactional
        @Modifying      // to mark delete or update query
        @Query(value = "DELETE FROM batch_job_parameter e WHERE e. batch_job_id=:BatchJobId" ,nativeQuery = true)
        void deleteById(long BatchJobId);// it will delete all the record with specific name
        List<CreateBatchJobParameterEntity> findAllByCreateBatchJobId (Long createBatchJobId);


}