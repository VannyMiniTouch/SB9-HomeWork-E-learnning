package co.istad.elearningapi.controller;

import co.istad.elearningapi.dto.RoleResDto;
import co.istad.elearningapi.entity.Role;
import co.istad.elearningapi.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/roles")
public class RolesController {
    private final RoleService roleService;

    @GetMapping
    public List<RoleResDto> getAllRoles(){
        return  roleService.getAllRoles();
    }

    @GetMapping("/{id}")
    public RoleResDto getRoleByID(@PathVariable Integer id){
        return  roleService.getRoleByID(id);
    }

}
