# Project time tracker: Java backend

Simple time tracking software. Create projects and measure the time spent on them. Part of my thesis project.

## Run project
 
````
mvn package
java -jar .\target\thesis-backend-1.0-SNAPSHOT.jar
(if you're using some other OS than Windows, this is a bit different)
````

This project requires front-end application in order to run correctly. You may use one of the following:

- [AngularJS app](https://github.com/seppotarvainen/jyu-st-angularjs)
- [Angular 5 app](https://github.com/seppotarvainen/jyu-st-angular5)
- [React app](https://github.com/seppotarvainen/jyu-st-react)

## Study

The idea of the study is to compare maintainability of the front-end applications done with different JavaScript frameworks. Maintainability is measured with [sonarcloud](https://about.sonarcloud.io/).

## License

Code licensed under the MIT Licence. See LICENSE.md.
