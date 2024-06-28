package com.gowtham.Students.service;

import com.gowtham.Students.datacontroller;

import java.util.List;

public interface IStudentlogic {
    public datacontroller savestudents(datacontroller student );
    public List<datacontroller> getAll();
   public  datacontroller getDetailsById(Integer id);
   public void deleteStudentId(Integer Id);
}
