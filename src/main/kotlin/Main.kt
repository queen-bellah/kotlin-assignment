fun main(){
 theName("Pearl")
modulus(9,2)
sum(2,3,4,5)
aboutMe("I'm a comedian, a decent listener, and pleasant company")
}
fun theName(name:String){
    println("Hello $name")
}
fun modulus(a: Int, b:Int){
    var result= a%b
    println("the result= $result")
}
fun sum(num1:Int, num2:Int, num3:Int, num4:Int){
    var result= num1+num2+num3+num4
    println("the result=$result")
}
fun aboutMe(interestingFact:String){
    println(interestingFact)
}