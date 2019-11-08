package com.pgiankoulidis.You_radio.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RadioRepo extends JpaRepository<Radio,Integer>{

}