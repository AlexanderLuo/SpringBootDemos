package com.alex.repository;

import com.alex.Dao.WorkRepositoryCustom;
import com.alex.Entity.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by Administrator on 2017/8/29.
 */
public interface WorkRepository extends WorkRepositoryCustom,JpaRepository<Work,String>,JpaSpecificationExecutor<Work> {

}
