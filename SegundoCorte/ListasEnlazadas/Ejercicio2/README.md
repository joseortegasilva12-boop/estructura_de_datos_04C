### 2. Inventario de Alimentos (Control de Caducidad)
Un supermercado necesita gestionar su estante de lácteos. Los productos que vencen más pronto deben colocarse al principio para ser vendidos primero.
- **La Clase Producto (Nodo):** Debe contener `nombre` (String), `cantidad` (int) y `diasParaVencer` (int).
- **El Problema:** Si llega un producto que vence en menos de 3 días, debe insertarse al **inicio** de la lista (prioridad de venta). Si vence en más tiempo, se pone al final.
- **Reto:** Crea un método que imprima solo los productos que tienen menos de 5 días para vencer.


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
