package com.example.servicesCourseBatchStd;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entityCourseBatchStd.Batch;
import com.example.repositoryCourseBatchStd.BatchRepository;


@Service
public class BatchManagerImpl implements BatchManager {

	@Autowired
	private BatchRepository repository;
	@Override
	public List<Batch> getBatch() {
		return repository.findAll();
	}

	@Override
	public Optional<Batch> getBatchById(int id) {
		return repository.findById(id);
	}

	@Override
	public void addBatch(Batch b) {
		repository.save(b);
	}

	@Override
	public void deleteBatch(int id) {
		repository.deleteById(id);
	}
}
