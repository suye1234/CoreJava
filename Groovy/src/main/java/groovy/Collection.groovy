package groovy
// Groovy中的范围，使用java.util.List
def range = 0..4
println range.class
assert range instanceof  List


// Groovy中的集合
def coll = ["Groovy", "Java", "Python"]
println coll.class
assert coll instanceof java.util.Collection
assert coll instanceof ArrayList

java.util.Collection<String> coll2 = new ArrayList<String>();
// 通过api添加元素
coll2.add("Groovy");
// 通过<<添加元素
coll2 << "Ruby"
// 通过集合索引添加元素,中间元素会置为null
coll2[3] = "Perl"

assert coll2[0] == "Groovy"
// 使用负索引，即倒数
println coll2[-1]
assert coll2[-2] == null

def numbers = [1,2,3,4]
// 集合运算, 加上一个元素
assert numbers + 5 == [1,2,3,4,5]
// 减去一个元素
assert numbers - 1 ==[2,3,4]
// 减去一个range
assert numbers - [2,3] == [1,4]

// 集合的一些通用方法
assert numbers.join(",") == "1,2,3,4"
assert [1,2,3,4,3].count(3) == 2

assert ["JAVA", "GROOVY"] ==  ["Java", "Groovy"]*.toUpperCase()
