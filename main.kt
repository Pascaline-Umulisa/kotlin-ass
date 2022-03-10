fun main (){
    word()
    var x=modulus()
    println(x)
    var outcome=knowme("Pascaline",20)
    println(outcome)
    var answer=take("akirachix")
    println(answer)

}
fun word(){
    var given="codeHive"
    var newword=given[4].toString()+given[5]+given[6]+given[7]
    println(newword)
}
fun modulus():Int{
    var num1=23
    var num2=12
    var mod=23%12
    return mod

}
fun knowme(name:String,age:Int):String{
    var sentence="Hi,my name is $name and I'm $age years old."
    return sentence

}
fun take(name: String):Int{
    return name.length
}