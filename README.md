# Ejercicio de POO - Persona

## Consigna

Implementar una clase llamada **Persona** con las siguientes características:

### Atributos:
- **Nombre**  
- **Edad**  
- **Fecha de nacimiento**  
- **DNI**  
- **Sexo**  
- **Peso**  
- **Altura**

### Valores por defecto:
- El **DNI** es un valor obligatorio, no tiene valor por defecto.
- **Fecha de nacimiento** será el 1 de enero de 2000.
- **Sexo** será **Femenino** por defecto.
- El **nombre** por defecto es "N" y el **apellido** es "N".
- El **peso** y la **altura** son 1 por defecto.

### Constructores:
Se deben crear los siguientes constructores:
- Constructor con **DNI**.
- Constructor con **DNI, nombre y apellido**.
- Constructor con **DNI, nombre, apellido y fecha de nacimiento**.

### Responsabilidades de la clase:
1. **Cálculo del índice de masa corporal (IMC)**: La persona debe ser capaz de calcular su índice de masa corporal, el cual es:  
   ```markdown
   IMC = peso / altura^2
------------------------------------------------------------------------------------------------------------------------------
(english)

---

### Versión en Inglés (Markdown):

```markdown
# OOP Exercise - Person

## Problem Description

Implement a class called **Person** with the following characteristics:

### Attributes:
- **Name**  
- **Age**  
- **Date of birth**  
- **DNI**  
- **Sex**  
- **Weight**  
- **Height**

### Default Values:
- **DNI** is a mandatory value, with no default value.
- **Date of birth** will be set to January 1, 2000.
- **Sex** will be **Female** by default.
- **Name** and **Surname** will be set to "N" by default.
- **Weight** and **Height** will both be set to 1 by default.

### Constructors:
The following constructors should be created:
- Constructor with **DNI**.
- Constructor with **DNI, name, and surname**.
- Constructor with **DNI, name, surname, and date of birth**.

### Class Responsibilities:
1. **Body Mass Index (BMI) Calculation**: The person should be able to calculate their body mass index, which is:  
   ```markdown
   BMI = weight / height^2
