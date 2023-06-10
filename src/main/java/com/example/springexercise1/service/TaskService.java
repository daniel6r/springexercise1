package com.example.springexercise1.service;

import com.example.springexercise1.model.Solution;
import com.example.springexercise1.model.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TaskService {
    private final SolutionSaver cacheSolutionSaver;
    private final SolutionSaver databaseSolutionSaver;

    public TaskService(@Qualifier("cacheSolutionSaver") SolutionSaver cacheSolutionSaver,
                       @Qualifier("databaseSolutionSaver") SolutionSaver databaseSolutionSaver) {
        this.cacheSolutionSaver = cacheSolutionSaver;
        this.databaseSolutionSaver = databaseSolutionSaver;
    }

    public void saveSolution(Solution solution, User user){
        if(user.isRegistered()){
            databaseSolutionSaver.saveSolution(solution);
        } else {
            cacheSolutionSaver.saveSolution(solution);
        }
    }
}
