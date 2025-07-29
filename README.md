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
Example
```
// Java 8 Lambda
        // () -> {}
        Runnable runnableThread = () -> {
            System.out.println("Inside RunnableThread");
        };

        Runnable runnableThread2 = () -> System.out.println("Inside RunnableThread2");
        new Thread(runnableThread2).start();

        new Thread( () -> System.out.println("Inside Runnable")).start();
```

Lambda in Practice (Things to keep in mind)


 > () -> single expression; // curly braces not needed

 > () -> { Multiple statements }; // curly braces are needed for multiple statements

## 🧮 Comparator and compareTo() in Java

### 🔹 What is `compareTo()`?

`compareTo()` is used to define **natural ordering** for objects by comparing them.

- It comes from the `Comparable<T>` interface.
- It returns:
    - the value 0 if this Integer is equal to the argument Integer;  
    - a value less than 0(negative) if this Integer is numerically less than the argument Integer;
    - and a value greater than 0(positive) if this Integer is numerically greater than the argument Integer

### 🔹 When to use `Comparator`?

If you want to define **custom sorting logic** (especially different from the natural order), you use a `Comparator`.

---

### 🟡 Java 7 Style: Anonymous Class

```java
Comparator<Integer> comparator = new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2); // 0 → equal, 1 → o1 > o2, -1 → o1 < o2
    }
};

System.out.println("Result of the comparator is: " + comparator.compare(3, 2));
```

### Java 8 Lambda Expression
```java
Comparator<Integer> comparator1 = (Integer a, Integer b) -> a.compareTo(b);
System.out.println("Result of the comparator1 using lambda is: " + comparator1.compare(3, 2));
```
## 🔧 Functional Interfaces in Java 8

### ✅ What is a Functional Interface?

A **Functional Interface** is an interface that contains **only one abstract method**. It can have:
- One abstract method (required)
- Any number of `default` or `static` methods

Functional interfaces are the foundation of **lambda expressions** in Java 8.

---

### 📘 Annotation: `@FunctionalInterface`

You can use the `@FunctionalInterface` annotation to make it explicit and to prevent accidental addition of more abstract methods.

```java
@FunctionalInterface
interface MyFunctionalInterface {
    void doSomething();
}
```
New Functional Interfaces in Java 8

 - Consumer - BiConsumer
 - Predicate - BiPredicate
 - Function - BiFunction, UnaryOperator, BinaryOperator

| Interface       | Method        | Input Type | Return Type | Use Case                                       |
| --------------- | ------------- | ---------- | ----------- | ---------------------------------------------- |
| `Consumer<T>`   | `accept(T t)` | Takes `T`  | `void`      | Performing operations like logging or printing |
| `Predicate<T>`  | `test(T t)`   | Takes `T`  | `boolean`   | Filtering data (true/false)                    |
| `Function<T,R>` | `apply(T t)`  | Takes `T`  | Returns `R` | Data transformation / conversion               |
