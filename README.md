The hello-world project

<div align="center">
    <img src="./assets/images/hello_world.png"/>
</div>

## Prerequisites
Make sure following software is installed on your PC
- [JDK 17](https://www.oracle.com/java/technologies/downloads/#java17) or later

## Project structure
```
.
├── chain-of-responsibility-pattern
│   ├── pom.xml
│   ...
├── pom.xml
|
└── README.md
```

## Start project

```shell
$ ./mvnw clean package
$ java -jar ./chain-of-responsibility-pattern/target/chain-of-responsibility-pattern-0.0.1-SNAPSHOT.jar
13:50:52.009 [main] INFO io.github.huypva.chainofresponsibilitypattern.Concrete1Handler -- Concrete1Handler handle request: Concrete1 request
13:50:52.012 [main] INFO io.github.huypva.chainofresponsibilitypattern.Concrete2Handler -- Concrete2Handler handle request: Concrete2 request
13:50:52.012 [main] INFO io.github.huypva.chainofresponsibilitypattern.BaseHandler -- No handler can handle request: Concrete3 request
```

## Contribute
The code is open sourced. I encourage fellow developers to contribute and help improve it!

- Fork it
- Create your feature branch (git checkout -b new-feature)
- Ensure all tests are passing
- Commit your changes (git commit -am 'Add some feature')
- Push to the branch (git push origin my-new-feature)
- Create new Pull Request

## Reference
- https://refactoring.guru/design-patterns/chain-of-responsibility