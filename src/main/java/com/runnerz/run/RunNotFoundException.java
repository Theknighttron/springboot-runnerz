package com.runnerz.run;

import org.springframework.web.bind.annotation.ResponseStatus;

public class RunNotFoundException extends RuntimeException {
    public RunNotFoundException() {
        super("Run Not Found");
    }
}
