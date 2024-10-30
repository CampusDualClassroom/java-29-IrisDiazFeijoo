package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Error intencionado.");
        } catch (RuntimeException e) {
            System.out.println("Se ha capturado una excepción: " + e.getMessage());
        } finally {
            System.out.println("El programa se ha completado sin terminar abruptamente.");
        }
    }
}

