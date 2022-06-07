# MSM PIDOVE

A message broker study project using RabbitMQ and Flyway.

_OBS: There is a branch that uses liquibase instead flyway. To see, run `git checkout liquibase` and follow the steps._

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

#### Flyway migrations

- Flyway reads the migration script files by default from your `src/main/resources/db/migration` directory.
- The migration file has its own naming convention that __MUST BE STRICTLY FOLLOWED.__
  - The migration file format = `<Prefix><Version>__<Description>.sql` where prefix is `V` typically followed by version number which is separated by underscore _ or a dot .. After double underscores __ is the description of your choice also separated words by underscore

#### Flyway commands
- __Migrate__: Migrate to latest version
- __Clean__: Drops all database objects
- __Info__: Prints info about migrations
- __Validate__: Validates applied migrations against available
- __Undo__: Reverts most recently applied migration
- __Baseline__: Baselines an existing database
- __Repair__: Used to fix problems with schema history table

#### Author

| ![user](https://avatars1.githubusercontent.com/u/64810260?v=4&s=150) |
| ----------------------------- |
| <p align="center"> <a href="https://github.com/kaio-giovanni"> @kaio-giovanni </a> </p>|
