package com.example.controllerCourseBatchStd;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entityCourseBatchStd.Batch;
import com.example.servicesCourseBatchStd.BatchManager;

@RestController
@CrossOrigin("*")
public class BatchController {
	@Autowired
    BatchManager b_manager;
	@GetMapping(value="/api/getBatch")
	public List<Batch>getBatch()
	{
		return b_manager.getBatch();
	}
	@GetMapping(value="/api/getBatch/{id}")
	public Optional<Batch> getBatchById(@PathVariable int id)
	{
		return b_manager.getBatchById(id);
	}
	@PostMapping(value="/api/addBatch")
	public void addBatch(@RequestBody Batch b)
	{
		b_manager.addBatch(b);
	}
	@DeleteMapping(value="/api/deleteBatch/{id}")
	public void deleteBatch(@PathVariable int id)
	{
		b_manager.deleteBatch(id);
	}
}


