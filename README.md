# SmartOcupation - Gestión de Alquileres 🏠

Este proyecto es una aplicación de escritorio desarrollada en **Java** diseñada para centralizar y optimizar la gestión de datos de la empresa **SmartOcupation**. Permite la consulta de viviendas y el histórico de alquileres mediante una interfaz gráfica conectada a una base de datos relacional.

## 🚀 Características Principales
* **Visualización de Datos:** Tabla dinámica que carga información de viviendas y contratos desde MySQL.
* **Interfaz Intuitiva:** Uso de Java Swing para una experiencia de usuario simplificada.
* **Filtros de Fecha:** Integración de componentes visuales para la selección de rangos temporales.
* **Pruebas Unitarias:** Implementación de tests para verificar la integridad de la conexión JDBC.

## 🛠️ Stack Tecnológico
* **Lenguaje:** Java (JDK 24)
* **Base de Datos:** MySQL 8.0 (Puerto 3306)
* **Entorno de Desarrollo:** NetBeans
* **Librerías Externas:**
    * `JCalendar-1.4`: Para la gestión de componentes de fecha.
    * `MySQL Connector/J 8.0.27`: Driver de conectividad JDBC.
    * `JUnit 4.13.2`: Framework para pruebas automatizadas.

## 📂 Estructura del Repositorio
* `/src`: Código fuente de la lógica de negocio y la interfaz gráfica (`GUI`).
* `/test`: Clases de prueba unitaria para validación de componentes.
* `/lib`: Dependencias externas (.jar) necesarias para el proyecto.

## 📝 Nota sobre las Pruebas (QA)
El proyecto incluye la clase `ConexionBDTest.java`. Aunque el código es sintácticamente correcto y sigue el estándar de JUnit 4, la ejecución en ciertos entornos locales puede requerir la configuración adicional de la librería Hamcrest en el Classpath del IDE. La lógica de conexión ha sido verificada manualmente y es plenamente funcional.

---
**Desarrollado por:** franciscatech
