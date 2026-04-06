### 4. Monitoreo Industrial (Sensores en Tiempo Real)
Una planta química registra lecturas de sus tanques cada hora en una lista enlazada para auditoría.
- **La Clase Lectura (Nodo):** Debe contener `idSensor` (int), `temperatura` (double), `presion` (double) y `hora` (String).
- **El Problema:** Las lecturas se van agregando al inicio para que la más reciente sea siempre la primera que vea el supervisor.
- **Reto:** Implementa un método que busque y muestre la lectura con la **temperatura más alta** registrada en el historial.


## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
