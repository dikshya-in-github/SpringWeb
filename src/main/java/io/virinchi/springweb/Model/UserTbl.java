package io.virinchi.springweb.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity     //Creates the table with provided name in database. UserTbl  ->user_tbl
@Data       //lombok ko ho, it gives getter setter and everything
public class UserTbl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;

}
