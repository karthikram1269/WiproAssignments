package com.assign.controller;

import com.assign.entities.School;
import com.assign.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private SchoolService service;

    @PostMapping("/add")
    public School add(@RequestBody School school) {
        return service.saveSchool(school);
    }

    @GetMapping("/all")
    public List<School> getAll() {
        return service.getAll();
    }

    @PatchMapping("/{id}/address")
    public School updateAddress(@PathVariable long id, @RequestParam String newAddress) {
        return service.updateAddress(id, newAddress);
    }

    @GetMapping("/search/address")
    public List<School> byAddress(@RequestParam String address) {
        return service.getByAddress(address);
    }

    @GetMapping("/search/experience")
    public List<School> byExperience(@RequestParam("experience") int experience) {
        return service.getSchoolsByTeacherExperience(experience);
    }

    @GetMapping("/{id}")
    public School getOne(@PathVariable long id) {
        return service.getById(id);
    }
}
