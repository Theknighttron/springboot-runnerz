package com.runnerz.run;

import java.time.LocalDateTime;

// The record in immutable
public record Run(
        Integer id,
        String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        Integer miles,
        Location location) {
}
