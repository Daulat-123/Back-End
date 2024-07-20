package com.staffManage.demo.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v2/Admin")
public class AdminController {
    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/login")
    public Admin login(@RequestBody LoginRequest loginRequest) {
        return adminService.login(loginRequest.getEmail(), loginRequest.getPassword());
    }

    // AdminController.java
    @PostMapping("/register")
    public ResponseEntity<String> registerNewAdmin(@RequestBody Admin admin) {
        adminService.addNewAdmin(admin);
        return ResponseEntity.ok("Admin registered successfully");
    }

}
