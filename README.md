# DWF_LAB_Desafio1mg250290
## Desafío Práctico – Desarrollo Web con Framework

## Estudiante
Nombre: Valeria del Rosario Montano González
Carnet: MG250290

## Descricion de proyecto
Sistema donde se encuantran las tablas 
-Alumno
-Materia
-Profesor
-Tabla intermedia AlumnoMateria (muchos a muchos)
Se implementó @Embeddable y @EmbeddedId.

## Arquitectura del Poryecto
src/main/java 
  sv.edu.udb 
      domain --- Entidades JPA 
      repository --- Interfaces JpaRepository 
      service --- Interfaces de negocio 
## Base de datos 
-Un Alumno puede inscribirse en muchas Materias.
-Una Materia puede tener muchos Alumnos.
-La tabla intermedia alumno_materia utiliza una clave compuesta.

## Configuración application.properties 
Configuración JPA
Consola H2

## Pruebas 
@SpringBootTest
para ejecutar pruebas : mvn clean install

## Ejecución del proyecto
Ejecutar el DesafíoMg250290Application y acceder a tu nav favorito y poner la URL 
http://localhost:8080/h2-console
donde debes poner jdbc:h2:mem:testdb y dejar lo demas asi como esta y deberia parecer los 5 datos ingresador de data.sql
