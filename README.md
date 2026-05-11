# Bautista-post1-u9
Actividad Post-Contenido 1 / Unidad 9

# Productos Service

 <img width="1872" height="320" alt="image" src="https://github.com/user-attachments/assets/aec076a7-189e-4cf9-b672-fc9695b2a91f" />


## Descripción

Microservicio de gestión de productos desarrollado con Spring Boot.

El proyecto implementa una API REST para administrar productos, incluyendo operaciones CRUD, pruebas unitarias, pruebas de integración y cobertura de código automatizada mediante JaCoCo.

Además, cuenta con integración continua (CI/CD) utilizando GitHub Actions para ejecutar automáticamente las pruebas y generar reportes de cobertura en cada push o pull request hacia la rama `main`.

---

## Tecnologías Utilizadas

- Java 21
- Spring Boot 3.5
- Maven
- JUnit 5
- Mockito
- Spring Boot Test
- JaCoCo
- GitHub Actions
- H2 Database

---

## Funcionalidades

- Crear productos
- Listar productos
- Buscar productos por ID
- Actualizar productos
- Eliminar productos
- Validaciones de negocio
- Persistencia con JPA
- Cobertura de pruebas automatizada

---

## Ejecutar el Proyecto

### Clonar repositorio

```
https://github.com/JahirBautistaQ/Bautista-post2-u9
```

---

## Ejecutar pruebas unitarias

```bash
mvn test
```

Ejecuta únicamente las pruebas unitarias y de integración.

---

## Ejecutar pruebas + cobertura JaCoCo

```bash
mvn verify
```

Este comando:

- Ejecuta todas las pruebas
- Genera el reporte de cobertura
- Empaqueta el proyecto

---

## Reporte JaCoCo

El reporte HTML se genera en:

```bash
target/site/jacoco/index.html
```

Abrir en navegador:

```bash
start target/site/jacoco/index.html
```

---

## Cobertura de Código

La clase `ProductoServiceImpl` alcanza una cobertura de líneas igual o superior al 70%, cumpliendo con los requisitos del taller.

<img width="1326" height="181" alt="image" src="https://github.com/user-attachments/assets/23692f45-df10-443e-9692-15c55f270a43" />


---

## Integración Continua (CI/CD)

El proyecto utiliza GitHub Actions para:

- Compilar automáticamente
- Ejecutar pruebas
- Validar cobertura
- Generar artefactos JaCoCo

Workflow ubicado en:

```text
.github/workflows/ci.yml
```

---

## Estructura del Proyecto

```text
src
 ├── main
 │    ├── java
 │    └── resources
 ├── test
 │    ├── java
 │    └── resources
.github
 └── workflows
      └── ci.yml
docs
 └── jacoco-report.png
```

---

## Autor

Jaime Jahir Bautista Quiñones

Universidad de Santander - UDES  
Ingeniería de Sistemas  
Patrones de Diseño de Software
