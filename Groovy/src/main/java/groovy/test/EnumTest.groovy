package groovy.test

import groovy.Day

/**
 * Created by suye on 2017/1/16.
 */
class EnumTest {
    static void main(args){
        // 使用enum类型
        def today = Day.SATURDAY
        // 进行switch判断
        switch(today){
            //Saturday or Sunday
            case [Day.SATURDAY, Day.SUNDAY]: println "Weekends are cool"
                break
            //a day between Monday and Friday
            case Day.MONDAY..Day.FRIDAY:
                println "Boring work day"
                break
            default:
                println "Are you sure this is a valid day?"
        }

    }
}
