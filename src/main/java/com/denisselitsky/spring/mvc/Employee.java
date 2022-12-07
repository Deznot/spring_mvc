package com.denisselitsky.spring.mvc;

import java.util.*;

public class Employee {
    private String name;
    private String surname;
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String,String> carBrands;
    private String[] languages;
    private Map<String,String> languageMap;

    public Employee() {
        departments = new HashMap<String, String>();
        departments.put("Information Technology","IT");
        departments.put("Human Resources","HR");
        departments.put("Sales","Sales");

        carBrands = new HashMap<String,String>();
        carBrands.put("BMV","BMV");
        carBrands.put("Audi","Audi");
        carBrands.put("Volvo","Volvo");

        languageMap = new HashMap<String,String>();
        languageMap.put("English","EN");
        languageMap.put("Dutch","DE");
        languageMap.put("French","FR");
    }

    public Map<String, String> getLanguageMap() {
        return languageMap;
    }

    public String[] getLanguages() {
        return languages;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setLanguageMap(Map<String, String> languageMap) {
        this.languageMap = languageMap;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }
    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
