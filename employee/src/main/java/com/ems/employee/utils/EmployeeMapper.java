package com.ems.employee.utils;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.ems.employee.dto.EmployeeRequestDto;
import com.ems.employee.dto.EmployeeResponseDto;
import com.ems.employee.model.Employee;

@Mapper(componentModel = "spring") // integrates with Spring
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    // Entity → DTO
    EmployeeRequestDto toDTO(Employee employee);

    // DTO → Entity
    Employee toEntity(EmployeeRequestDto dto);
}
