package groovy.test

import groovy.Song

class SongExample{

    static void main(args){
       testSong()
    }

    static def testSong(){
        // 通过自动生成的构造器产生对象
        def sng = new Song(name:"Le Freak", artist:"Chic", genre:"Disco")
        // 生成另一个对象,构造器只使用2个参数
        def sng2 = new Song(name:"Kung Fu Fighting", genre:"Disco")

        def sng3 = new Song()
        // 直接给属性复制
        sng3.name = "Funkytown"
        // 调用set方法给属性复制
        sng3.setArtist("Lipps Inc.")
        // 也可以省略括号
        sng3.setGenre "Disco"

        println sng

        // ?可以判断是否为空，不为空的情况下才执行调用
        println sng2.artist?.toUpperCase()

        // 普通的三元表达式
        String artist = sng2.artist != null ? sng2.artist : "Unknown";
        println artist
        // 简化以后的三元表达式
        String genre = sng2.genre ?: "Unknown"
        println genre


        assert sng3.getArtist() == "Lipps Inc."

        assert sng3.genre == "DISCO"

        assert sng.sum(1,2,3) == 6


    }
}