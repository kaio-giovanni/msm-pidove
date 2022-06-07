# MSM PIDOVE

A message broker study project using RabbitMQ and Liquibase.

_OBS: There is a branch that uses flyway instead liquibase. To see, run `git checkout flyway` and follow the steps._

#### Project setup

1. Clone and build project
```bash
git clone https://github.com/kaio-giovanni/msm-pidove.git
cd msm-pidove
gradle clean build
```
2. Create an `.env` file in the project root based on `.env.example`
3. Install the RabbitMQ:
   1. step one
   2. step two
   3. step three

#### Run Project

1. Run command:

```bash
gradle bootRun
```

#### Run tests

- To run all tests, execute the command bellow:

```bash
gradle test
```

- To run a specific test, execute the command bellow:

```bash
gradle test --tests SomeSpecificTest
```

- To run tests with debug mode, execute the command bellow:

```bash
DEBUG=true gradle test
```

#### Liquibase terminology

- __ChangeSet__ - A set of changes to be applied to the database
- __Change__ - A single change to be applied to the database
- __Changelog__ - A file which has a list of changeSet's to be applied
- __Preconditions__ - Conditions which control the execution
- __Context__ - An expression to help control if the script should or should not run
- __Changelog Parameters__ - Placeholders which can be replaced ar tun time

#### Author

| ![user](https://avatars1.githubusercontent.com/u/64810260?v=4&s=150) |
| ----------------------------- |
| <p align="center"> <a href="https://github.com/kaio-giovanni"> @kaio-giovanni </a> </p>|