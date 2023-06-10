package com.example.springexercise1.service;

import com.example.springexercise1.model.Solution;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class DatabaseSolutionSaver implements SolutionSaver{
    @Override
    public void saveSolution(Solution solution) {
        System.out.println("Saving solution to database");
    }
}
