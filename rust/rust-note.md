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