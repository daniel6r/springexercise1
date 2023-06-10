package com.example.springexercise1.service;

import com.example.springexercise1.model.Solution;
import jdk.jfr.Unsigned;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class CacheSolutionSaver implements SolutionSaver{
    @Override
    public void saveSolution(Solution solution) {
        System.out.println("Saving solution to cache");
    }
}
