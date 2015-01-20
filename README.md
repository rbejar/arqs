# Arquitecturas Software (30245) (Software Architecture)
[From the degree in Computer Science, specialization in Software Engineering, EINA, UNIZAR](http://titulaciones.unizar.es/asignaturas/30245/index14.html).

This repository contains examples and solutions to some exercises.

# Use
Clone this repository in your computer:
`$ git clone https://github.com/rbejar/arqs.git`
Once cloned, go to each directory and check the README.md for specific instructions.

Generally speaking, everything is configured to use [Gradle](http://www.gradle.org/docs/current/userguide/userguide.html) to manage builds and dependencies. 

## Console
Go to the directory you want to try and check that there is a file named `build.gradle`. Run `$ ./gradlew tasks` (gradlew.bat if you are in Windows). If everything is fine, this will download a specific version of Gradle to your computer (only the first time), and will show the available Gradle tasks in the build. For instance, for a simple Java application `$ ./gradlew run` will run the main program.

## Eclipse
Install the plugin named "Gradle Integration for Eclipse" wich corresponds to your Eclipse version from its marketplace. Then go to File > Import..., choose Gradle Project, put as root folder the directory you want (one with a build.gradle file) from the project, click on Build model, choose the one that is shown and click on Finish. This imports the project to Eclipse so you can run it from there.  

If dependencies are not automatically met, right click on the name of the projecto in the Package Explorer and choose Gradle > Refresh All.
