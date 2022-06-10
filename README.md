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

2. Create an `.env` file in the project root based on [.env.example](./.env.example)
3. Configure the RabbitMQ (install locally or configure a server)

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

- **ChangeSet** - A set of changes to be applied to the database
- **Change** - A single change to be applied to the database
- **Changelog** - A file which has a list of changeSet's to be applied
- **Preconditions** - Conditions which control the execution
- **Context** - An expression to help control if the script should or should not run
- **Changelog Parameters** - Placeholders which can be replaced ar tun time

#### Author

| ![user](https://avatars1.githubusercontent.com/u/64810260?v=4&s=150)                    |
| --------------------------------------------------------------------------------------- |
| <p align="center"> <a href="https://github.com/kaio-giovanni"> @kaio-giovanni </a> </p> |
