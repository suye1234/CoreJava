package groovy
// 定义一个map，key不一定是String，Groovy中的map是class java.util.LinkedHashMap
def mp = [name : "SuYe", "age": 35]

println mp.getClass()

// 添加项,使用运算符
mp = mp + ["gender" : "male"]
// 使用map的put方法
mp.put("id", 23)
// 直接定义属性
mp.address = "Shanghai"

println mp

// 检索值，通过map的get方法
assert mp.get("address") == "Shanghai"
// 通过key作为下表索引
assert mp["name"] == "SuYe"
// 通过key作为成员名索引
assert mp.age == 35