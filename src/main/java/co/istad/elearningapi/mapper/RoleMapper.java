package co.istad.elearningapi.mapper;

import co.istad.elearningapi.dto.RoleResDto;
import co.istad.elearningapi.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface RoleMapper {

    @Mapping(target = "authorities.name", source = "authorities.name")
    List<RoleResDto> toRolesResDto(List<Role> role);
    RoleResDto toRoleResDto(Role role);
}
