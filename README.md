# SISTEMA DE BLOG CON CRUD COMPLETO

Esta aplicación permite crear, consultar, actualizar y eliminar notas utilizando una API REST conectada a una base de datos MySQL gestionada con phpMyAdmin.

## Tecnologías utilizadas
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL / phpMyAdmin
- Postman

## Endpoints disponibles

| Método | Endpoint             | Descripción                        |
|--------|----------------------|------------------------------------|
| POST   | /notas/crear         | Crear una nueva nota               |
| GET    | /notas/{id}          | Obtener una nota por su ID         |
| GET    | /notas               | Obtener todas las notas            |
| PUT    | /notas/editar/{id}   | Actualizar una nota existente      |
| DELETE | /notas/borrar/{id}   | Eliminar una nota                  |


## Formato esperado (JSON)
```json
{
  "titulo": "Ejemplo de nota",
  "contenido": "Contenido de prueba",
  "fechaCreacion": "28-05-2024"
}
