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

```rust
let s: String = String::from("Hello, world!");
```

To print a string:

```rust
fn main() {
    print!("{}", s);
}
```

## Booleans

```rust
let x: bool = true;
let y: bool = false;
```

To print a boolean:

```rust
fn main() {
    print!("{}", x);
}
```

## Arrays

```rust
let a: [i32; 5] = [1, 2, 3, 4, 5];
```

To print an array:

```rust
fn main() {
    print!("{:?}", a);
}
```

## Tuples

```rust
let t: (i32, f32, u8) = (10, 20.0, 30);
```

To print a tuple:

```rust
fn main() {
    print!("{:?}", t);
}
```

## Structs

```rust
struct Person {
    name: String,
    age: u8,
}

let p = Person {
    name: String::from("Ann"),
    age: 20,
};
```

To print a struct:

```rust
fn main() {
    print!("{:?}", p);
}
```

## Enums

```rust
enum Color {
    Red,
    Green,
    Blue,
}

let c = Color::Red;
```

To print an enum:

```rust
fn main() {
    print!("{:?}", c);
}
```

## Functions

```rust
fn add(x: i32, y: i32) -> i32 {
    x + y
}
```

To call a function:

```rust
fn main() {
    let result = add(10, 20);
    print!("The result is {}", result);
}
```

## Control Flow

### if

```rust
fn main() {
    let x = 10;

    if x > 5 {
        println!("x is greater than 5");
    } else {
        println!("x is less than or equal to 5");
    }
}
```

### match

```rust
fn main() {
    let x = 10;

    match x {
        5 => println!("x is 5"),
        _ => println!("x is not 5"),
    }
}
```

### while

```rust
fn main() {
    let mut x = 0;

    while x < 5 {
        println!("x is {}", x);
        x += 1;
    }
}
```

### for

```rust
fn main() {
    for i in 0..5 {
        println!("i is {}", i);
    }
}
```

## Error Handling

```rust
fn divide(x: i32, y: i32) -> Result<i32, String> {
    if y == 0 {
        Err(String::from("Cannot divide by zero"))
    } else {
        Ok(x / y)
    }
}  
```

To handle errors:

```rust
fn main() {
    let result = divide(10, 0);

    match result {
        Ok(value) => println!("The result is {}", value),
        Err(error) => println!("Error: {}", error),
    }
}
```

## Modules

```rust
mod math {
    pub fn add(x: i32, y: i32) -> i32 {
        x + y
    }
}

use math::add;

fn main() {
    let result = add(10, 20);
    println!("The result is {}", result);
}
```

## Traits

```rust
trait Printable {
    fn print(&self);
}

struct Person {
    name: String,
    age: u8,
}

impl Printable for Person {
    fn print(&self) {
        println!("Name: {}, Age: {}", self.name, self.age);
    }
}

impl Printable for i32 {
    fn print(&self) {
        println!("Value: {}", self);
    }
}
```

To use a trait:

```rust
fn main() {
    let p = Person {
        name: String::from("Ann"),
        age: 20,
    };

    p.print();

    let x = 10;
    x.print();
}
```

## Generics

```rust
fn add(x: i32, y: i32) -> i32 {
    x + y
}

fn main() {
    let result = add(10, 20);
    println!("The result is {}", result);
}
```

## Closures

```rust
fn main() {
    let x = 10;

    let closure = || {
        println!("x is {}", x);
    };

    closure();
}
```

## Type Inference

```rust
fn main() {
    let x = 10;
    let y = 20;

    let sum = x + y;
    println!("The sum is {}", sum);
}
```

## Type Conversion

```rust
fn main() {
    let x = 10;
    let y = 20;

    let sum = x + y;
    println!("The sum is {}", sum);

    let result = x * y;
    println!("The result is {}", result);
}
```

## Type Checking

```rust
fn main() {
    let x = 10;
    let y = 20;

    let sum = x + y;
    println!("The sum is {}", sum);

    let result = x * y;
    println!("The result is {}", result);
}
```

## Ownership

```rust
fn main() {
    let x = 10;
    let y = 20;

    let sum = x + y;
    println!("The sum is {}", sum);

    let result = x * y;
    println!("The result is {}", result);
}
```

## References

```rust
fn main() {
    let x = 10;
    let y = 20;

    let sum = x + y;
    println!("The sum is {}", sum);

    let result = x * y;
    println!("The result is {}", result);
}
```

## Mutability

```rust
fn main() {
    let mut x = 10;
    let y = 20;

    let sum = x + y;
    println!("The sum is {}", sum);

    let result = x * y;
    println!("The result is {}", result);
}
```

## Borrowing

```rust
fn main() {
    let x = 10;
    let y = 20;

    let sum = x + y;
    println!("The sum is {}", sum);

    let result = x * y;
    println!("The result is {}", result);
}
```

## Lifetimes

```rust
fn main() {
    let x = 10;
    let y = 20;

    let sum = x + y;
    println!("The sum is {}", sum);

    let result = x * y;
    println!("The result is {}", result);
}
```

## Generics

```rust
fn main() {
    let x = 10;
    let y = 20;

    let sum = x + y;
    println!("The sum is {}", sum);

    let result = x * y;
    println!("The result is {}", result);
}
```

## Traits

```rust
fn main() {
    let x = 10;
    let y = 20;

    let sum = x + y;
    println!("The sum is {}", sum);

    let result = x * y;
    println!("The result is {}", result);
}
```
