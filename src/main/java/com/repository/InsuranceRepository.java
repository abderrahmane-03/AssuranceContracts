package com.repository;

import org.springframework.stereotype.Repository;
import com.entity.HealthInsurance;
import com.entity.CarInsurance;
import com.entity.HomeInsurance;
@Repository
public class InsuranceRepository extends GenericRepository<Object, Long> {
}
