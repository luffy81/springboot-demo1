package com.gi.riset.demo1.repository;

import com.gi.riset.demo1.domain.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository <Car,Long>{
}
