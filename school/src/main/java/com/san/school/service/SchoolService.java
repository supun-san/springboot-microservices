package com.san.school.service;

import com.san.school.entity.School;
import com.san.school.repository.SchoolRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SchoolService {

    private final SchoolRepository schoolRepository;

    public void saveSchool(School school) {
        schoolRepository.save(school);
    }

    public List<School> findAllSchool() {
        return schoolRepository.findAll();
    }
}
