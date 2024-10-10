fn main() {
    let mut my_str: String = String::from("this is initial string");

    print!("\n string before changing is this: {}\n", my_str);

    my_str.push_str("this is new string");
    print!("\n this is the new string: {}\n", my_str);
}
