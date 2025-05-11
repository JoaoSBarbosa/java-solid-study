package com.joaosbarbosadev.vercel.wolfProductSolid.interfaces.exception.custom;

public class ControllerEntityNotFoundException extends RuntimeException {
    public ControllerEntityNotFoundException(String message) {
        super(message);
    }
}
