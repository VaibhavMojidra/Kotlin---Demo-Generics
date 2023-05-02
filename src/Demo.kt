//It is better to go for generic data type whenever we are not sure about the data type we are going to use in the application. Generally, in Kotlin generics is defined by <T> where “T” stands for template, which can be determined dynamically by Kotlin complier. In the following example, we will see how to use generic data types in Kotlin programming language.

class genericsExample<T>(input:T) {
   init {
      println("I am getting called with the value "+input)
   }
}

fun main(args: Array<String>) {
   var obj1 = genericsExample<String>("Vaibhav")
   var obj2 = genericsExample<Int>(10)
}

//In the above piece of code, we are creating one class with generic return type, which is represented as <T>. Take a look at the main method, where we have dynamically defined its value at the run by proving the value type, while creating the object of this class. This is how generics is interpreted by Kotlin compiler.
