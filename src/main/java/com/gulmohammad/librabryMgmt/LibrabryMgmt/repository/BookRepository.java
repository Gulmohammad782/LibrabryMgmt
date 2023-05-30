package com.gulmohammad.librabryMgmt.LibrabryMgmt.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.gulmohammad.librabryMgmt.LibrabryMgmt.Entity.BookPojo;

public interface BookRepository extends JpaRepository<BookPojo,Integer>
{
    //List<BookPojo> findByBook_name(String book_name);
}
