package net.javaguides.springboot.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Instance;
import net.javaguides.springboot.repository.InstanceRepository;

@Service
public class InstanceServiceimpl implements InstanceService{
	
	@Autowired
	private InstanceRepository instanceRepository;

	@Override
	public List<Instance> getAllInstances() {
		return instanceRepository.findAll();
	}

	
	

}
