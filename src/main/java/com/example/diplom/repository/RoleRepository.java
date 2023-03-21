package com.example.diplom.repository;

import com.example.diplom.model.Role;
import com.example.diplom.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String str);

    Role findByUsers(User user);
}
