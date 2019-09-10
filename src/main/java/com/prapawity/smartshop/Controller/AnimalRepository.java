package com.prapawity.smartshop.Controller;

import com.prapawity.smartshop.model.Animals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animals, Integer> {

}
