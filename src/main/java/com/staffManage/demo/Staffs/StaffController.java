package com.staffManage.demo.Staffs;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v2/Staff")
public class StaffController {
    private final StaffService staffService;

    @Autowired

    public StaffController(StaffService staffService){
        this.staffService = staffService;
    }

    @GetMapping
    public List<Staffs>getStaffs(){
        return staffService.getStaffs();
    }


    @PostMapping
    public  Staffs addStaffs(@RequestBody Staffs staffs){
       return staffService.createStaffs(staffs);

        }

    @DeleteMapping("delete/{StaffID}" )
    public Staffs deleteStaffs(@PathVariable int StaffID){
       return staffService.deleteByID(StaffID);
    }

    @PatchMapping(path = "{StaffID}")
    public void updateStaffs(@PathVariable("StaffID") Long StaffID,
                            @RequestParam(required = false) String FullName,
                            @RequestParam(required = false) String Address,
                            @RequestParam(required = false) int PhoneNumber,
                            @RequestParam(required = false) String Email,
                            @RequestParam(required = false) int Date){
        staffService.updateStaff(StaffID, FullName, Address, PhoneNumber, Email, Date);


    }



}
