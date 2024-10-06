fn main() {
    
    // ─── Boolean Types In Rust ──────────────────────────────────────────
    let x: bool = true; // boolean
    let y: bool = false; // boolean

    print!("\n x is {}\n y is {}\n", x, y);  

    let z: bool = x && y; // boolean
    print!("\n z is {}\n", z);

    let w: bool = x || y; // boolean
    print!("\n w is {}\n", w);

    let u: bool = !x; // boolean
    print!("\n u is {}\n", u);
    
}