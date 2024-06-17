package com.javatpoint.controller;
import com.javatpoint.entity.MasterTask;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TaskManagementController
{
@GetMapping("/task/getTask")
public MasterTask getMasterTask()
{
    MasterTask m =new MasterTask();
    m.setId(3);
    m.setCompanyName("WorkJam");
    return m;
}

public void createMasterTask(){

}
}
