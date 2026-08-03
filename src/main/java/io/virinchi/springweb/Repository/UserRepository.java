package io.virinchi.springweb.Repository;

import io.virinchi.springweb.Model.UserTbl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository     //Communicates with the MODEL table for CRUD Operations
/*
    RULES
        1. Model table needs to be provided to REPOSITORY
        2. CRUD Operations need to be extended by REPOSITORY
*/
public interface UserRepository extends JpaRepository<UserTbl, Integer> {

}
