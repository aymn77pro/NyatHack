//health status
fun gethealthstatus(healthpoint:Int,name:String,isBlessed:Boolean):String{
val healthstatus : String =
    if (healthpoint==100) "$name is in excellent condition!"
    else if (healthpoint in 90..99)"$name have few scratches!"
    else if (healthpoint in 75..89)if (isBlessed)"$name has some minor wounds but is healing quite quickly!"
    else    "$name has some minor wounds"
    else if (healthpoint in 15..74)"$name pretty hurt"
    else    "$name is in awful condition!"
    return(healthstatus)
}
//aure color
fun getaureColor(isBlessed: Boolean,healthpoint: Int,IsImmortal:Boolean):String{
val aureColer = aureColor(isBlessed, healthpoint, IsImmortal)
return (aureColer)
}
//karma color
fun GetKarmaColor(healthpoint: Int):String{
    val karma = (Math.pow(Math.random(),(110 - healthpoint)/100.0)*20.0).toInt()
    val karmastatus:String = when(karma){
        in 0..5 -> "red"
        in 6..10 -> "orange"
        in 11..15 -> "purple"
        else ->  "green"
    }
    return (karmastatus)
}
