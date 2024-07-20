package com.staffManage.demo.Staffs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StaffRepo extends JpaRepository<Staffs, Long> {


}
