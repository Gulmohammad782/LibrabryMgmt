package com.gulmohammad.librabryMgmt.LibrabryMgmt.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gulmohammad.librabryMgmt.LibrabryMgmt.Entity.SmartBookSystem;

public interface SmartBookSystemRepository extends JpaRepository<SmartBookSystem, Integer>
{
    List<SmartBookSystem> findByMemberName(String memberName);
}
