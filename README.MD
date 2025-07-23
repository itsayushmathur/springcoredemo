Spring Core
---

## 🧩 Spring Container (Object Factory)

The **Spring Container** acts as an **object factory**. Its primary responsibilities are:

- **Creating and managing objects** (Inversion of Control)
- **Injecting object dependencies** (Dependency Injection)

---

### 🔁 Inversion of Control (IoC)

IoC is the approach of **outsourcing the construction and management of objects** to a container (like Spring), rather than doing it manually in your code.

---

### 📥 Dependency Injection

Dependency Injection is a specific implementation of IoC.

- Based on the **Dependency Inversion Principle**
- The **client delegates** the responsibility of providing its dependencies to another object (usually the Spring container)

---

## 💉 Injection Types – Which One to Use?

### 🔧 Constructor Injection
- Use when you have **required dependencies**
- Prevents the object from being created without its dependencies
- **Recommended by the Spring team** as the first choice

### 🛠 Setter Injection
- Use when you have **optional dependencies**
- If the dependency is not provided, your app can fall back on default logic

---

## 🔄 What is Spring Autowiring?

For Dependency Injection, Spring supports **autowiring**:

- Spring looks for a matching **class or interface by type**
- If found, Spring **automatically injects** the dependency
- Hence the term: **Autowiring**

---

## 👨‍💻 Development Process – Constructor Injection

1. Define the **dependency interface** and its implementation class
2. Create a **REST Controller**
3. Add a **constructor** to the controller to inject the dependency
4. Add a `@GetMapping` method, e.g., `/dailyworkout` to expose functionality

---

## 🧱 `@Component` Annotation

- Marks a class as a **Spring Bean**
- A **Spring Bean** is a standard Java class managed by the Spring container
- Also makes the bean available for **dependency injection**

---

## 🏷 Annotations Explained: `@SpringBootApplication`

`@SpringBootApplication` is a **composite annotation**, made up of:

- `@EnableAutoConfiguration` – Enables Spring Boot's auto-configuration support
- `@ComponentScan` – Scans the current and sub-packages for Spring components
- `@Configuration` – Allows registering beans using `@Bean` or importing other config classes

---
## 💉 Injection Types: Which to Use When?

### 🔧 Constructor Injection
- Use when you have **required dependencies**
- Prevents the class from being instantiated without its dependencies
- **Recommended by the Spring team** as the **first choice**

### 🛠 Setter Injection
- Use when you have **optional dependencies**
- Allows the app to fall back to **default logic** if the dependency is not provided

### 🚫 Field Injection
- **NOT recommended**
- Makes **unit testing difficult** due to lack of constructor/setter access  

---
## 🏷️ `@Qualifier` Annotation 

When multiple beans of the same type exist, Spring needs help deciding **which one to inject**.  
Use the `@Qualifier` annotation to specify **exactly which bean** should be injected.
- Works with @Autowired
- Helps avoid NoUniqueBeanDefinitionException

### Example:
```java
@Qualifier("mySpecialCoach")
private Coach coach;
```
---
## ⭐ `@Primary` Annotation 

When multiple beans of the same type are available, Spring uses the one marked with `@Primary` **by default** during dependency injection.

### Key Points:
- Used alongside `@Component`, `@Service`, etc.
- Helps avoid ambiguity **without requiring `@Qualifier`**
- Only one bean of a type should be marked as `@Primary`

### Example:
```java
@Primary
@Component
public class TennisCoach implements Coach { ... }
```
- If no @Qualifier is specified, Spring will inject the @Primary bean.
### *Note:Qualifier will have a higher priority than Primary.
