### 3. Torre de Control (Aterrizajes de Emergencia)
Simula la cola de aviones esperando para aterrizar en un aeropuerto congestionado.
- **La Clase Vuelo (Nodo):** Debe contener `numeroVuelo` (String), `aerolinea` (String), `combustibleRestante` (int) y `pasajeros` (int).
- **El Problema:** Normalmente los vuelos se forman al final de la cola. Sin embargo, si un vuelo reporta menos de 10 unidades de combustible, debe ser movido inmediatamente al **inicio** de la lista (Cabeza).
- **Reto:** Implementar el método `reportarEmergencia(String numeroVuelo)` que busque un vuelo en la cola y lo mueva al principio.


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
