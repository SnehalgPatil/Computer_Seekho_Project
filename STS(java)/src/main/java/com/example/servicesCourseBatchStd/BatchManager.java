package com.example.servicesCourseBatchStd;

import java.util.List;

import java.util.Optional;

import com.example.entityCourseBatchStd.Batch;



public interface BatchManager {
	List<Batch>getBatch();
	Optional<Batch> getBatchById(int id);
	void addBatch(Batch b);
	void deleteBatch(int id);
	//void updateBatch(Batch batch);
}

