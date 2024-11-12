package placement.projectwithspringboot.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //java class ka  ak object database me store hoga
@Data //in lombok used for making getters and setters
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "UserData") //automatically made table by jpa in database
public class UserData {
    @Id          // it make primary key in table
    @Column(name = "ID")  //used for making column in table also we can column name here
    @GeneratedValue         //used for generate value automatically
    private int id ;

    @Column(name = "name")
    private String name ;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "Role")
    private String Role ;

    enum Role {
        USER, ADMIN
    }
}
