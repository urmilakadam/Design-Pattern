# **Design Patterns with Java 8 and Core Java**

![Design Patterns](https://img.shields.io/badge/Design%20Patterns-Java%208-blue.svg)  
A collection of **design patterns** implemented using **Java 8 features** such as **lambda expressions, streams, functional interfaces, and method references** alongside traditional **core Java** concepts. The purpose of this repository is to demonstrate how **modern Java enhances classic design patterns**, making code more concise and readable.

---

## 📖 **Table of Contents**
- [Implemented Design Patterns](#-implemented-design-patterns)
- [Project Structure](#-project-structure)
- [Technologies and Tools Used](#-technologies-and-tools-used)
- [How to Use the Repository](#-how-to-use-the-repository)
- [Examples](#-examples)
- [Contributing](#-contributing)
- [License](#-license)

---

## 🚀 **Implemented Design Patterns**

### 1. **Creational Design Patterns**
These patterns focus on the **object creation mechanism**, ensuring flexibility and control over object instantiation.

- **Singleton Pattern**  
  *Ensures only one instance of a class exists and provides a global point of access.*
  - **Example:**  
    A singleton database connection manager that provides a shared connection object to multiple components.

- **Builder Pattern**  
  *Separates the construction of a complex object from its representation, allowing the same process to create different products.*
  - **Example:**  
    A builder for car configurations where the engine, color, and transmission type can be specified.

- **Prototype Pattern**  
  *Creates a new object by cloning an existing one to reuse its structure and properties.*
  - **Example:**  
    Game characters cloned with a shared base but customized abilities.

- **Factory Method Pattern**  
  *Defines an interface for creating an object but lets subclasses decide which class to instantiate.*
  - **Example:**  
    A `DocumentFactory` that creates either Word or PDF documents based on user input.

- **Abstract Factory Pattern**  
  *Provides an interface to create families of related objects without specifying the exact class of the object.*
  - **Example:**  
    A GUI factory that provides different UI components (buttons, text fields) for Windows and Mac systems.

---

### 2. **Structural Design Patterns**
Structural patterns describe how objects are composed and related to form larger structures, enhancing flexibility and efficiency.

- **Adapter Pattern**  
  *Converts one interface into another expected by the client, allowing incompatible systems to work together.*
  - **Example:**  
    Adapting a legacy logging system using a lambda expression to integrate it with a modern logging framework.

- **Decorator Pattern**  
  *Dynamically adds behavior to an object without modifying its structure.*
  - **Example:**  
    Adding scrollbars or borders to a window using `Function` interfaces in Java 8.

- **Facade Pattern**  
  *Provides a simple interface to a complex subsystem, reducing dependencies and simplifying usage.*
  - **Example:**  
    A `HomeAutomation` class that controls lights, air conditioners, and fans through a single interface.

- **Proxy Pattern**  
  *Controls access to an object by creating a surrogate or placeholder for it.*
  - **Example:**  
    Lazy-loading expensive resources like images only when needed through a virtual proxy.

- **Composite Pattern**  
  *Composes objects into tree structures to represent part-whole hierarchies.*
  - **Example:**  
    A file system hierarchy with folders containing files or other folders.

- **Bridge Pattern**  
  *Decouples an abstraction from its implementation, allowing them to vary independently.*
  - **Example:**  
    Separating shapes (like circles and squares) from the rendering API (OpenGL or DirectX) they use.

---

### 3. **Behavioral Design Patterns**
These patterns focus on how objects communicate with each other dynamically and distribute responsibilities.

- **Observer Pattern**  
  *Defines a one-to-many dependency, where changes in one object (subject) notify all its dependents (observers).*
  - **Example:**  
    Newsletter subscription where all subscribers receive notifications when new content is published.

- **Strategy Pattern**  
  *Defines a family of algorithms, encapsulates each one, and makes them interchangeable.*
  - **Example:**  
    Implementing sorting strategies (quick sort, merge sort) using functional interfaces in Java 8.

- **Command Pattern**  
  *Encapsulates a request as an object, allowing parameterization and queuing of requests.*
  - **Example:**  
    Implementing undo/redo functionality using lambdas and `Runnable` interfaces.

- **Chain of Responsibility Pattern**  
  *Passes a request along a chain of handlers until one of them handles it.*
  - **Example:**  
    Processing log messages with different levels (INFO, DEBUG, ERROR) using a stream-based approach.

- **State Pattern**  
  *Allows an object to change its behavior when its internal state changes.*
  - **Example:**  
    A traffic light system transitioning between red, yellow, and green states.

- **Template Method Pattern**  
  *Defines the skeleton of an algorithm and allows subclasses to refine certain steps.*
  - **Example:**  
    Cooking recipe steps where only specific preparation methods differ.

- **Mediator Pattern**  
  *Centralizes communication between multiple objects, reducing their dependencies on each other.*
  - **Example:**  
    Air traffic control coordinating communication between flights.

- **Visitor Pattern**  
  *Separates algorithms from the objects on which they operate.*
  - **Example:**  
    Implementing export functionality for different file formats (XML, JSON) using the visitor pattern.

---

## 🛠️ **Technologies and Tools Used**
- **Java 8** features like lambdas, streams, and functional interfaces
- **IntelliJ IDEA** or **Eclipse** as the development environment

---

## 🔧 **How to Use the Repository**
1. Clone the repository:
   ```bash
   git clone https://github.com/urmilakadam/Design-Pattern.git
   cd Design-Pattern