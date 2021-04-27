package net.javaguides.springboot.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Instance;

@Repository
public interface InstanceRepository extends JpaRepository<Instance, Long>{
	
}