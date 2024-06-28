package com.gowtham.Students.studentDao;

import com.gowtham.Students.datacontroller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDatadao extends JpaRepository<datacontroller, Integer> {
}
