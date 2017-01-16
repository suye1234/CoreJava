package groovy

class NoType {
    // no public, the default modifier is public
    static void main(args) {
        // Use single quotation to declare String
        def var = 'hello'
        // Invoke System.out.println
        println(var)
        // without parenthesis
        println var
        // no semi-colon to end the sentence
        println(var.class)

        // Use double quotation to declare String
        def var2 = "hello2"
        println(var2)
        println var2
        println(var2.class)
    }
}