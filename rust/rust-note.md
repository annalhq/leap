# Rust

## Simple variables

```rust
let x: i32 = 10; // signed 32 bit integer
let y: u32 = 20; // unsigned 32 bit integer
let z: f32 = 30.0; // 32 bit floating point number
```
To print these values:

```rust
fn main() {
    print!("x is {}\n y is {}\n z is {}\n", x, y, z);
}   
```
**i8, i16, i32, i64, u8, u16, u32, u64, f32, f64** are the types of variables in Rust.

By default, the type of a variable is i32.

In i8, we can store values from -128 to 127.

We have 8 bits to store a value. The first bit is the sign bit, and the rest are the value.
So, the maximum value is 2^7 - 1 = 127.

Thus range is from -128 (-2^7) to 127 (2^7 - 1).

## Strings

In Rust, a string is a sequence of Unicode scalar values encoded as UTF-8. 
It does not have fixed type, and can be created dynamically.

```rust
let s: String = String::from("Hello, world!");
```

To print a string:

```rust
fn main() {
    print!("{}", s);
}
```
Strings can be changed during runtime, so it can get unsafe if not handled properly.

When we use 
```rust
let s: String = String::from("Hello, world!");
```
The type of s is String, and it is immutable and while using
```rust
let my_string = "hello world";
```
the type of my_string is &str, and it is a reference to a string Literal.

## Memory Management

Rust does not uses Garbage collector like Java or Javascript, this is the reason which makes Rust fast.

It achieves memory management using the:

- Mutability
- Heap and Stack
- Ownership model
- Borrowing and reference
- Lifetimes

## Mutability

Immutable variables are those whose values cannot be changed once assigned

```Rust
fn main(){
  let x:i32 = 1;
  x = 2; // cannot be changed as x is immutable

  print!("{}", x);
}
```
By default all variables in Rust are immutable because:
1. Immutable variables are inherently thread safe and hence no need for synchronization
2. The values cannot be changed so no errors when multiple threads are accessing the same variable

We can make variable mutable using keyword `mut`

`let mut x:i32 = 1`

## Ownership

> [!NOTE]
> [!info] What is Ownership?
> Ownership is a set of rules that govern how a Rust program manages memory. All programs have to manage the way they use a computer’s memory while running. Some languages have garbage collection that regularly looks for no-longer-used memory as the program runs; in other languages, the programmer must explicitly allocate and free the memory. Rust uses a third approach: memory is managed through a system of ownership with a set of rules that the compiler checks. If any of the rules are violated, the program won’t compile. None of the features of ownership will slow down your program while it’s running.
Because ownership is a new concept for many programmers, it does take some time to get used to. The good news is that the more experienced you become with Rust and the rules of the ownership system, the easier you’ll find it to naturally develop code that is safe and efficient. Keep at it!
When you understand ownership, you’ll have a solid foundation for understanding the features that make Rust unique. In this chapter, you’ll learn ownership by working through some examples that focus on a very common data structure: strings.

Each piece of data in Rust has single owner at a given time, and when the owner goes out of scope the variable will be dropped.

### Stack variables

1. Passing stack variables inside functions
```rust
fn main() {
		let x = 1; // crated on stack
		let y = 3; // created on stack
    println!("{}", sum(x, y));
    println!("Hello, world!");
}

fn sum(a: i32, b: i32) -> i32 {
    let c = a + b;
    return c;
}
```
When the function is executed it is popped out of the stack and so does the variables associated with it.

2. Scoping variables in the same function

```rust
fn main() {
    let x = 1; // crated on stack
    {
        let y = 3; // created on stack
    }

    println!("{}", y); // throws error
}
```
this will throw error as the scope of the variable ***y*** was just limited inside the {} braces.

## Heap variable

These variable have single owner and if their owner gets out of scope then variables get deallocated.

Memory management in C leads to lots of error when heap is associated, like ***dangling pointers, double free error*** 

- A dangling pointer in C is a pointer that points to a memory location that has been deallocated or is no longer valid. Dangling pointers can cause various problems in a program, including segmentation faults, memory leaks, and unpredictable behavior.

- Double free errors occur when free() is called more than once with the same memory address as an argument. Calling free() twice on the same value can lead to memory leak.
