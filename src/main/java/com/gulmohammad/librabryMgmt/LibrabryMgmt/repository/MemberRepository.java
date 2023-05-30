package com.gulmohammad.librabryMgmt.LibrabryMgmt.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.gulmohammad.librabryMgmt.LibrabryMgmt.Entity.MemberPojo;

public interface MemberRepository extends JpaRepository<MemberPojo, Integer>
{
    //List<MemberPojo> findByMember_name(String name);
}
