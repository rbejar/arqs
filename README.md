# Arquitecturas Software (30245)
[Asignatura del grado en Ingeniería Informática, especialidad de Ingeniería del Software, EINA, UNIZAR](http://titulaciones.unizar.es/asignaturas/30245/index14.html).

Este repositorio contiene diverso código (ejemplos y soluciones de ejercicios) que usaremos en el transcurso de la asignatura.

# Uso
Clona el repositorio en tu computador:
`$ git clone https://github.com/rbejar/arqs.git`
Una vez clonado accede a cada directorio y consulta allí el fichero README.md para instrucciones específicas.

En general está todo configurado para usar [Gradle](http://www.gradle.org/docs/current/userguide/userguide.html) como herramienta de automatización de build y gestión automática de dependencias.

## Desde consola
Accede al directorio que quieras probar y comprueba que hay un fichero que se llama `build.gradle`. Allí ejecuta `$ ./gradlew tasks` (el gradlew.bat si estás en Windows). Si todo va bien, esto descargará la versión de Gradle que se usa en tu computador (si no está ya), y mostrará las tareas de Gradle disponibles en ese build. Por ejemplo, si es una aplicación de Java sencilla, `$ ./gradlew run` ejecutará el programa principal.

## Desde Eclipse
Instala el plugin "Gradle Integration for Eclipse" que corresponda con tu versión de Eclipse desde el marketplace. Luego File > Import... elige Gradle Project, pon como root folder la carpeta que te interese (una que tenga un fichero build.gradle) del proyecto clonado desde Github, haz click en Build Model, selecciona el que sale y click en Finish. Ya tienes el proyecto importado en Eclipse y listo para ejecutarlo desde ahí. 

Si no te actualiza las dependencias automáticamente, haz click derecho en el nombre del proyecto en el Package Explorer, y elige Gradle > Refresh All.
