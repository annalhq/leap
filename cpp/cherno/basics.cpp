// source file -> compiler -> executable
// anything that begins with # is a preprocessor directive and is not compiled
// main() is the entry point of the program

#include <iostream>

void Log(const char* message){
        std::cout << message << std::endl;
}

int main(){
        // pushing hello world into the cout function
        std::cout << "Hello World!" << std::endl;
        // endl -> end line

        Log("hello from another world");
        std::cin.get(); 
        
}