package com.joaosbarbosadev.vercel.wolfProductSolid.interfaces.exception.handler;

import com.joaosbarbosadev.vercel.wolfProductSolid.domain.StanderError;
import com.joaosbarbosadev.vercel.wolfProductSolid.interfaces.exception.custom.ControllerEntityNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.Instant;

@RestControllerAdvice
public class HandleExceptions extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ControllerEntityNotFoundException.class)
    public ResponseEntity<StanderError> handleEntityNotFoundException(ControllerEntityNotFoundException ex, HttpServletRequest request) {

        HttpStatus status = HttpStatus.NOT_FOUND;
        StanderError standerError = new StanderError();
        standerError.setMessage(ex.getMessage());
        standerError.setStatus(status.value());
        standerError.setError(status.getReasonPhrase());
        standerError.setTimestamp(Instant.now());
        standerError.setPath(request.getRequestURI());
        standerError.setTitle("Conteúdo não encontrado");
        return new ResponseEntity<>(standerError, status);
    }
}
