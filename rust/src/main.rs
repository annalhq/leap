//fn main() {
//    println!("Hello, World");   
//}

fn main() {
    // strings in rust
    let greeting: String = String::from("hello world");
    println!("{}", greeting);

    // slightly advanced way to print chars from a string
    // optionally could be a char or maybe not <type-safety>
    let char1: Option<char> = greeting.chars().nth(1);

    // match if it is char or not
    //match char1 {
    //    Some(c: char) => print!("{}", c),
    //    None => println!("No character at index 10000"),
    //}
    // print!("{}", greeting.chars().nth(1000));
    print!("char1 is: {}", char1.unwrap());
}
