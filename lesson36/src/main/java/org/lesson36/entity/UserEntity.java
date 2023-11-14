package org.lesson36.entity;

import lombok.*;
import org.lesson36.Role;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Role role;
    private LocalDate birthdate;
    private boolean isMan;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER,
    cascade = CascadeType.ALL)
    private List<TaskEntity> tasks;


}
