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

### Lambda Expression

> Lambda is equivalent to a function(method) without a name

Syntax:

 ```
    ()          ->          { }
Input params   arrow    Lambda body
```
Usage:
    Implement functional interfaces( SAM( single abstract method))

```
@FunctionalInterface
public interface Comparator<T> {
    int compare(T o1, T o2);
}

@FunctionalInterface
public interface Runnable {
    public abstract void run();
}
```