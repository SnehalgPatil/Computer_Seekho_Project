package com.example.repositoryCourseBatchStd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entityCourseBatchStd.Batch;

import jakarta.transaction.Transactional;
@Repository
@Transactional
public interface BatchRepository extends JpaRepository<Batch, Integer> {

	/*
	@Query(value="select * from batch  where courseid=(select cid from course where cname=:cname)",nativeQuery = true)
	List<Batch> getBatches(@Param("cname")String cname);
	*/
}
