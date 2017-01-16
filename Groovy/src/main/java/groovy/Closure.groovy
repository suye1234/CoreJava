package groovy

def array = [1, 2, 3, 4]
// 通过闭包迭代集合，it为默认关键字
array.each {
    println it
}

// 用val替代默认关键字it
array.each {
    val -> println val
}

def map = [name: "SuYe", age: 35]
map.each {
    println it.getKey() + " : " + it.getValue()
}

// 使用两个变量迭代map
map.each {
    key, value -> println "${key}": "${value}"
}


// 迭代字符串
"ITERATION".each{
    println it.toLowerCase()
}

// 单独定义一个闭包（类似于方法，支持多个参数），可以认为这是一个闭包对象（类似于JavaScript中的function）
def wd = {word -> return "Hello ${word}!!"}

println wd("Groovy");
println wd.call("Java");

def sum = {a,b -> return a+b}
println sum(1,2);
