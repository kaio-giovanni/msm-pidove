# MSM PIDOVE
A message broker project using RabbitMQ.

- This project has two branches. Each one uses a different database tool: liquibase and flyway.
- To see and run them, execute the command `git checkout [liquibase | flyway]`
- The main reason for this is to study and use both tools for the same project to get to know each one better.

#### Project setup

1. Clone and build project

```bash
  git clone https://github.com/kaio-giovanni/msm-pidove.git
  cd msm-pidove
  git checkout [liquibase | flyway]
  gradle clean build
```
2. Create an `.env` file in the project root based on `.env.example` stored in development branches
3. Install the RabbitMQ


#### Author

| ![user](https://avatars1.githubusercontent.com/u/64810260?v=4&s=150) |
| ----------------------------- |
| <p align="center"> <a href="https://github.com/kaio-giovanni"> @kaio-giovanni </a> </p>|



