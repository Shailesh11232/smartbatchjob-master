package com.smartbatchjobui.smartbatchjobui.repositoris;

import com.smartbatchjobui.smartbatchjobui.entity.CreateBatchJobEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreateBatchJobRepository extends JpaRepository<CreateBatchJobEntity,Long>{
}