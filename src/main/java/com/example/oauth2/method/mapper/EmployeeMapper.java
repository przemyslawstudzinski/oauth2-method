package com.example.oauth2.method.mapper;


import com.example.oauth2.method.domain.Employee;
import com.example.oauth2.method.dto.EmployeeDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
  EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

  EmployeeDto toEmployeeDto(Employee employee);

  Employee toEmployee(EmployeeDto employeeDto);
}
