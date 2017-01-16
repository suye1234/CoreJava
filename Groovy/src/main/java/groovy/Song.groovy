package groovy
/**
 * 使用Groovy定义一个Class.
 * 不需要public修饰符
 */
class Song {
    def name
    def artist
    def genre

    // 不需要构造函数

    // 不需要getter/setter方法，但是可以覆盖
    // 不需要申明变量的类型
    void setName(name){
        this.name = name;
    }

    // 覆盖get方法
    def getGenre(){
        genre.toUpperCase()
    }

    // 覆盖toString方法
    // 只有一行代码可以省略return关键字，因为Groovy 默认返回方法的最后一行的值。
    String toString(){
        "${name}, ${artist}, ${getGenre()}"
    }


    int sum(int... var){
        def total = 0;

        for(i in var){
            total += i;
        }

        return total;
    }

}

