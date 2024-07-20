package com.staffManage.demo.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public List<Admin> getAdmin() {
        return adminRepository.findAll();
    }

    public void addNewAdmin(Admin admin) {
        Optional<Admin> adminOptional = adminRepository.findByEmail(admin.getEmail());
        if (adminOptional.isPresent()) {
            throw new IllegalStateException("Admin already exists");
        }
        adminRepository.save(admin);
    }

    public Admin login(String email, String password) {
        Optional<Admin> adminOptional = adminRepository.findByEmail(email);
        if (adminOptional.isPresent() && adminOptional.get().getPassword().equals(password)) {
            return adminOptional.get();
        } else {
            throw new IllegalStateException("Invalid email or password");
        }
    }
}
