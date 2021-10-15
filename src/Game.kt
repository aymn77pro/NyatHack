fun main(){
 val name = "aymn"
 var healthpoint = 89
 val isBlessed = true
 val IsImmortal = false
 val aureIsVisbl = isBlessed && healthpoint >=50 || IsImmortal
    //aure
 if (aureIsVisbl){println("green")}
 else{println("none")}
 if (healthpoint==100){ println("$name is in excellent condition!")}
 else if (healthpoint>=90){ println("$name have few scratches!")}
 else if (healthpoint>=75){
     if (isBlessed){println("$name has some minor wounds but is healing quite quickly!")}
     else{ println("$name has some minor wounds")}}
 else if (healthpoint>=15){println(name + "look pretty hurt")}
 else{println("$name is in awful condition!")}
}