package groovy

def helloStr = "Hello World!"
println helloStr.class

// 扩展metaClass的方法
String.metaClass.up = {println delegate.toUpperCase()}

// works fine
helloStr.up()

// 迭代metaClass的方法、属性
helloStr.metaClass.methods.each { println it.name }
helloStr.metaClass.properties.each { println it.name }


if (helloStr.metaClass.respondsTo(helloStr, 'up')) {
    println helloStr.toUpperCase()
}
