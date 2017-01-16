package groovy
/**
 * 使用类java的for循环，定义变量没有int
 * @param val
 */
def repeat1(val){
    println "repeat1"
    for (i = 0; i < 5; i++) {
        println val
    }
}

/**
 * 使用类pl/sql的for循环，定义范围0-5
 * @param val
 */
def repeat2(val){
    println "repeat2"
    for (i in 0..5) {
        println val
    }
}

/**
 * 定义范围1-5
 * @param val
 */
def repeat3(val){
    println "repeat3"
    for (i in 1..5) {
        println val
    }
}

/**
 * 0-5 不包含5
 * @param val
 */
def repeat4(val){
    println "repeat4"
    for (i in 0..<5) {
        println val
    }
}

/**
 * 通过变量控制循环次数，方法参数提供值
 * @param val
 * @param repeat
 */
def repeat5(val, repeat=5){
    println "repeat5"
    for (i in 0..<repeat) {
        println val
    }
}


repeat1("Hello World!")

repeat2("Hello World!")

repeat3("Hello World!")

repeat4("Hello World!")

repeat5("Hello First!")

repeat5("Hello Twice!", 2)

repeat5("Hello Third!", 3)