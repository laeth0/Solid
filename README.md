## SOLID Principles

![Cover](https://github.com/mman9our/SOLID_Principles/assets/72463762/0c6fc35e-4b5a-4249-ad7c-1cabd5b3352a)

SOLID is an acronym that stands for:

- `SRP`: Single Responsibility Principle (SRP): A class should have only one reason to change, meaning it should have only one responsibility or job.
- `OCP`: Open-Closed Principle (OCP): Software entities (classes, modules, functions) should be open for extension but closed for modification. This means that we should be able to extend the behavior of a
- `LSP`: Liskov Substitution Principle (LSP): Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program. In other words, a subclass should be able to replace its parent class without breaking the program's functionality.
- `ISP`: Interface Segregation Principle (ISP): Clients should not be forced to depend on interfaces they do not use. This principle encourages creating smaller, specific interfaces rather than large, monolithic ones.
- `DIP`: Dependency Inversion Principle (DIP): High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details; details should depend on abstractions. This principle promotes loose coupling between modules and easier maintenance.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
