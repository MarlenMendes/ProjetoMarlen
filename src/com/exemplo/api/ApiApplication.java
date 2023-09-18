package com.exemplo.api;

import jdk.internal.ref.CleanerImpl;

@SpringBootApplication
public class ApiApplication {

    private static CleanerImpl SpringApplication;

    public static void main(String[] args) {
        SpringApplication.run( );

    }
}


