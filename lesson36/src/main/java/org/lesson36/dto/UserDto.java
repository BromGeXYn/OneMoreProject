package org.lesson36.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.lesson36.Role;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private String name;
    private Role role;
    private LocalDate birthdateTo;
    private LocalDate birthdateFrom;
    private boolean isMan;

    public boolean getIsMan() {
        return isMan;
    }
}
