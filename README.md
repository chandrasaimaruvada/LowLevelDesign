# SOLID Principles in Java ✨

Welcome to the **SOLID Principles in Java** project! This repository explains the five core object-oriented design principles in an easy-to-understand manner, with:

- Real-world **Java code examples**
- Conceptual **diagrams** for visual clarity
- Practical **analogies**
- Maintainable and extensible code structures

---

## What is SOLID?

**SOLID** is an acronym for five principles that improve software architecture:

> "These principles help software developers create systems that are easier to maintain, understand, and scale."

Each letter represents:

| Principle | Stands For                              | Goal                                |
|-----------|------------------------------------------|-------------------------------------|
| S         | Single Responsibility Principle (SRP)    | One class = one responsibility       |
| O         | Open/Closed Principle (OCP)              | Open to extension, closed to change |
| L         | Liskov Substitution Principle (LSP)       | Subtypes should be substitutable   |
| I         | Interface Segregation Principle (ISP)     | Fine-grained interfaces             |
| D         | Dependency Inversion Principle (DIP)      | Depend on abstractions              |

---

## S - Single Responsibility Principle ✅

> "A class should have one, and only one, reason to change."

### 🔍 Example: Book Purchase System

| Class                   | Responsibility               |
|------------------------|------------------------------|
| `BookPurchaseService`  | Handle purchase logic        |
| `BookPurchaseEmail`    | Send email notification      |

**Violation**: A class doing both logic and notification.

**SRP Solution**: Separate them into 2 focused classes.

**Benefits**:
- Easy to modify
- Testable units
- Scalable to add more behaviors

**Visual:**
```
[User] --> [BookPurchaseService] --> [BookPurchaseEmail]
```

---

## O - Open/Closed Principle ⛓

> "Software entities should be open for extension, but closed for modification."

### 🔍 Example: Vehicle Premium Calculation

| Class                      | Role                         |
|---------------------------|------------------------------|
| `VehiclePremiumService`   | Uses interface to calculate  |
| `Bike`, `Car`, `Bus`      | Implement their own logic    |

**OCP Applied**: Use a common `VehiclePremiumStrategy` interface to add new vehicles without touching core service.

**Benefits**:
- Avoids breaking existing code
- Supports easy feature addition

**Visual:**
```
[VehiclePremiumService] --> [VehiclePremiumStrategy]
                                   |
       -----------------------------
       |            |              |
    [Bike]       [Car]          [Bus]
```

---

## L - Liskov Substitution Principle 🔄

> "Derived classes must be substitutable for their base classes."

### 🔍 Example: Document Export

| Class              | Exports                          |
|-------------------|----------------------------------|
| `DocumentExporter`| Base interface                   |
| `PdfExporter`, etc| Override `export()` behavior     |

**LSP Applied**: Service code calls `.export()` without knowing the actual exporter type.

**Benefits**:
- No runtime surprises
- Polymorphism works as expected

**Visual:**
```
[DocumentExportService] --> [DocumentExporter]
                                   |
      ------------------------------------------------
      |             |               |                |
  [PdfExporter] [ExcelExporter] [WordExporter] [PPTExporter]
```

---

## I - Interface Segregation Principle 🥺

> "Clients should not be forced to depend on methods they do not use."

### 🔍 Example: Smart Home Devices

| Device            | Interfaces it uses               |
|------------------|----------------------------------|
| `SmartLight`     | `Switchable`                     |
| `SmartCamera`    | `Switchable`, `Recordable`       |
| `SmartThermostat`| `Switchable`, `TemperatureControllable` |

**ISP Applied**: Each device gets only what it needs.

**Benefits**:
- Cleaner design
- Flexible to modify one functionality without affecting others

**Visual:**
```
[SmartDevice] --> [Switchable]
       |            |           |
    [Camera]     [Light]     [Thermostat]
        |             |              |
  [Recordable]     X        [TemperatureControllable]
```

---

## D - Dependency Inversion Principle ⚡

> "High-level modules should not depend on low-level modules. Both should depend on abstractions."

### 🔍 Example: Online Checkout with Payment Methods

| Component              | Depends on                     |
|------------------------|--------------------------------|
| `CheckoutService`      | `PaymentMethod` interface      |
| `CreditCardPayment` etc| Implement that interface       |

**DIP Applied**:
- `CheckoutService` does NOT care how payment is done.
- Easily plug in UPI, PayPal, etc.

**Benefits**:
- Decouples business logic from implementation
- Supports dependency injection

**Visual:**
```
[CheckoutService] --> [PaymentMethod]
                            |
       -------------------------------------
       |              |                 |
   [UpiPayment] [CreditCard]       [PayPal]
```

---

## 🎉 Bonus: Why SOLID?

- 🔧 Helps manage complexity
- 🌍 Makes code reusable and scalable
- 🔒 Reduces tight coupling
- ✅ Supports modern design patterns and testing

---

## 📚 Resources to Learn More

- [Uncle Bob - SOLID Principles](https://www.youtube.com/watch?v=TMuno5RZNeE)
- [Clean Code Book](https://www.goodreads.com/book/show/3735293-clean-code)
- [Refactoring Guru - SOLID](https://refactoring.guru/design-patterns/principles)

---

> “Clean code always looks like it was written by someone who cares.”  
> — Robert C. Martin

