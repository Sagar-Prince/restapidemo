package com.restapi.practice.restapidemo.repository;

import com.restapi.practice.restapidemo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "cust")
public interface CustRepo extends JpaRepository<Customer, Integer> {
    public List<Customer> findById(int id);

}
