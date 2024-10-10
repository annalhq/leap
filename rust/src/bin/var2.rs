fn main(){
    let mut x: i8 = 13;

    for _i in 0..10 { 
        x = x + 100; // it is greater than 127
        println!("x is {}", x);
    }
}