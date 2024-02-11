package co.istad.elearningapi.service;

import co.istad.elearningapi.dto.RoleResDto;
import co.istad.elearningapi.entity.Role;

import java.util.List;

public interface RoleService {
    public List<RoleResDto> getAllRoles();
    public RoleResDto getRoleByID(Integer id);
}
