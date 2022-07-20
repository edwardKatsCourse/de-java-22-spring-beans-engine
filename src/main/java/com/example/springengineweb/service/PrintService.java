package com.example.springengineweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("singleton")
@Service
public class PrintService {

    @Autowired
    private AbcService abcService; // new AbcServiceProxy() -> new AbcService()










    public void printAbc() {
        // singleton
        // ctor
        // post construct

        // prototype
        // ctor
        // post construct

        abcService.method();


        // destroy

        // ctor
        // post construct
        abcService.method();
        // destroy
    }
}
