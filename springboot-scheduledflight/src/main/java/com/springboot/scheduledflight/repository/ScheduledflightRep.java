package com.springboot.scheduledflight.repository;

import java.math.BigInteger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.scheduledflight.model.Scheduledflight;

@Repository
public interface ScheduledflightRep extends JpaRepository<Scheduledflight,BigInteger>{

}
