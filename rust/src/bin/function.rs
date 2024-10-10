fn main() {
    let a:i32 = 24;
    let b:i32 = 17;
    let c:i32 = do_sum(a,b);

    print!("the sum of {} and {} is {}", a,b,c);
}

fn do_sum(a: i32, b: i32) -> i32 {
    return a+b;
}
