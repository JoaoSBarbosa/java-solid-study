package com.joaosbarbosadev.vercel.wolfProductSolid.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StanderError {
    private String title;
    private String message;
    private Integer status;
    private Instant timestamp;
    private String path;
    private String details;
    private String error;
}
