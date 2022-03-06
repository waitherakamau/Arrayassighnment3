fun main(){
    strings()
    name()
    nums()
    var k=humans("benadate","joy","pascaline")
    println(k.contentToString())


}

fun strings(){
    var arraycars=arrayOf("Toyota","Audi","Benz","RollsRoyce")
    println(arraycars.contentToString())
}
fun name(){
    var cities=arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach { cit->
        println(cit.capitalize())
    }
}
fun nums(){
    var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
  var sum=numbers.get(1) + numbers.get(4)
 println(sum)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())



  }
fun humans(name1:String,name2:String,name3:String):Array<String>{
    var friends=arrayOf(name1,name2,name3)
    return friends

}

