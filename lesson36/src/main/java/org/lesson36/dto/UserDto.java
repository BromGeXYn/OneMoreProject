package org.lesson36.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.lesson36.Role;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private String name;
    private Role role;
    private String dateFrom;
    private String dateTo;
    private boolean isMan;

}
