fn main() {
    
    // ─── Strings In Rust ──────────────────────────────────────────
    let my_string: String = String::from("Hello, world!");
    // let my_string: &str = "hello world";  

    print!("{}\n", my_string);
    print!("{}\n", my_string.chars().nth(0).unwrap());
    print!("{}\n", my_string.len()
    print!("{}\n", my_string.chars().count());
}
