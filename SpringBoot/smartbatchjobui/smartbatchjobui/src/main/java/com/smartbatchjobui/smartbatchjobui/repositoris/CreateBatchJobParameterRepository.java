package com.smartbatchjobui.smartbatchjobui.repositoris;

import com.smartbatchjobui.smartbatchjobui.entity.CreateBatchJobParameterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreateBatchJobParameterRepository
        extends JpaRepository<CreateBatchJobParameterEntity,Long>{
        List<CreateBatchJobParameterEntity> findAllByCreateBatchJobId (Long createBatchJobId);
}