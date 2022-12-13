package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>
{
    @Query(value="select user_tbl.id,user_tbl.firstname,address_tbl.city from user_tbl left outer join address_tbl  on user_tbl.id=address_tbl.user_id",nativeQuery = true)
    ArrayList fun1();

    List<User> findByFirstnameIsNot(String name);
    List<User> findByLastnameIs(String name);
}