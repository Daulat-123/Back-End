package com.staffManage.demo.Staffs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

;import java.util.List;

@Service
public class StaffService {
    
    private final StaffRepo staffRepo;
    
    @Autowired
    public StaffService(StaffRepo staffRepo){
        this.staffRepo = staffRepo;
        
    }
    
    public List<Staffs> getStaffs(){
        return staffRepo.findAll();
    }
    public void addNewStaffs(Staffs staffs){
        
    }
    public void deleteStaffs(){
        
    }


    public Staffs deleteStaffs(Long staffID) {
        Long Staffs = staffID;
        return deleteStaffs(Staffs);
    }

    public void updateStaff(Long staffID, String fullName, String address, int phoneNumber, String email, int date) {
    }

    public Staffs createStaffs(Staffs staffs) {
        return staffRepo.save(staffs);
    }

    public Staffs deleteByID(int staffID) {
        Staffs Staffs = null;
        return staffRepo.save(Staffs);
    }
}
    