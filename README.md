# ModernJavaToolkit ✨

A curated collection of practical examples and reusable snippets showcasing modern Java features — including functional interfaces, lambda expressions, method and constructor references, `Optional`, and Java's date and time API. Perfect for learners, interview prep, or as a quick reference for writing cleaner, functional-style Java code.

---

## Imperative vs Declarative Programming in Java 🆚

This example demonstrates the difference between **Imperative** and **Declarative** programming styles in Java by calculating the **sum of the first 100 natural numbers**.

### Imperative Approach

> "How to do it" — step-by-step instructions

```java
int sum = 0;
for (int i = 0; i <= 100; i++) {
    sum = sum + i;
}
System.out.println("Sum using Imperative approach :" + sum);
```

### Declarative Approach

> "What to do" — describe the desired outcome

```java
int sum1 = IntStream.rangeClosed(0, 100).sum();
System.out.println("Sum using Declarative approach :" + sum1);
```