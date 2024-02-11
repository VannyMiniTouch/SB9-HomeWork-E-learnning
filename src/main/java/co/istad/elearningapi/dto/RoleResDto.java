package co.istad.elearningapi.dto;

import java.util.List;

public record RoleResDto(
        String name,
//        List<UserResDto> users,
        List<AuthorityResDto> authorities

) {
}
