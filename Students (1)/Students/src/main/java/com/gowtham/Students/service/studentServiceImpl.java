package com.gowtham.Students.service;

import com.gowtham.Students.datacontroller;
import com.gowtham.Students.studentDao.StudentDatadao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class studentServiceImpl implements  IStudentlogic{
    @Autowired
    private StudentDatadao studeo;
    @Override
    public datacontroller savestudents(datacontroller student) {

        studeo.save(student);
        return student;
    }

    @Override
    public List<datacontroller> getAll() {
        return studeo.findAll();
    }

    @Override
    public datacontroller getDetailsById(Integer id) {
        Optional<datacontroller> option = studeo.findById(id);
        return option.get();
    }

    @Override
    public void deleteStudentId(Integer Id) {
        studeo.deleteById(Id);
    }
}
