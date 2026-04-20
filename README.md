# 📘 Object-Oriented Programming (PBO) Assignment

## 📌 Description

This project is part of an Object-Oriented Programming (OOP) course assignment.
It demonstrates the implementation of a custom Java class (`SepedaMotor`) using constructors and methods, as well as basic CRUD concepts.

---

## 🏍️ Case Study

The class represents a motorcycle object (**SepedaMotor**) with basic attributes such as brand, type, and engine capacity.

---

## 🎯 Objectives

* Understand class and object concepts in Java
* Implement constructors (default & parameterized)
* Create methods (void and return type)
* Apply basic CRUD concepts

---

## 🧱 Class Structure

### `SepedaMotor`

**Attributes:**

* `merk` → motorcycle brand
* `tipe` → motorcycle type/model
* `cc` → engine capacity

**Constructors:**

* Default constructor
* Parameterized constructor

**Methods:**

* `tampilkanInfo()` → display object data (READ)
* `hitungEstimasiPajak()` → return estimated tax value

---

## ⚙️ CRUD Concept Implementation

| Operation | Implementation                                  |
| --------- | ----------------------------------------------- |
| Create    | Creating object using `new SepedaMotor(...)`    |
| Read      | Display data using `tampilkanInfo()`            |
| Update    | Using setter method (if added)                  |
| Delete    | Managed automatically by Java Garbage Collector |

---

## ▶️ How to Run

1. Open the project in NetBeans
2. Run `Main.java`
3. Check the output in the console

---

## 🧪 Example Output

```
--- Object 1 ---
Motorcycle Details: Not Set General (0cc)

--- Object 2 ---
Motorcycle Details: Kawasaki KLX 150 (150cc)
Estimated Tax: Rp75000.0
```

---

## 🛠️ Technologies Used

* Java
* NetBeans IDE
* Maven

## 📎 Notes

This project focuses on basic OOP implementation and is intended for educational purposes.
