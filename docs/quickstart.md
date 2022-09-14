## Getting started

Below is an example of how you can install and set up your service.

1. Use the spring initializer and create a Spring Boot application with `Spring Web`
   dependencies [https://start.spring.io](https://start.spring.io)
2. Add the `digiwf-oce-cosmos-integration-starter` dependency.

With Maven:

```
   <dependency>
        <groupId>io.muenchendigital.digiwf</groupId>
        <artifactId>digiwf-oce-cosmos-integration-starter</artifactId>
        <version>${version}</version>
   </dependency>
```

With Gradle:

```
implementation group: 'io.muenchendigital.digiwf', name: 'digiwf-oce-cosmos-integration-starter', version: '${version}'
```

4. Configure your application

```yaml
io.muenchendigital.digiwf.oce-cosmos:
  url: <URL>
```

5. Use the repository beans

tbd
