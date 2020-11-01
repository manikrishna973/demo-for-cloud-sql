package com.mani.demoforcloudsql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepo extends JpaRepository<AppUsers, Integer> {

}
