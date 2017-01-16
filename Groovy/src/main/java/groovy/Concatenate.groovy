package groovy
// Use plus to concat multiple string
def var = "hello " +
        "world " +
        ", Shanghai"

println var

// without plus
def var2 = """hello 
                world    
                , Shanghai"""

println(var2)


def str1 = "Programming Language"
def str2 = "Groovy"
// Gstring
println "$str1 : $str2"
// String
println '$str1 : $str2'
