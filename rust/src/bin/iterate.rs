fn main(){

    let sentence: String = String::from("hi i am annalhq");
    let first_word = get_first_word(sentence);
    
    print!("the first word is {}", first_word);
}

fn get_first_word (sentence: String) -> String {
    let mut words: String = String::from("");
    for char in sentence.chars() {
        words.push_str(char.to_string().as_str());
        if char == ' ' {
            break;
        }
    }
    return words;
}

// other functions to get the first word
// fn get_first_word(sentence: String) -> String {
//     for char in sentence.chars() {
//         if char.is_whitespace() {
//             continue;
//         }
//         return char.to_string();
//     }
//     return String::from("");
// }

// fn get_first_word(sentence: String) -> String {
//     let words: Vec<&str> = sentence.split(" ").collect();
//     return words[0].to_string();
// }