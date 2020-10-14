import java.util.*

fun main(){
    val number1 = Scanner(System.`in`)
    print("Введите число лайков: ")
    val likes = number1.nextInt()
    val word = if(likes % 10 == 1 && likes%100 != 11){" человеку"} else {     " людям"   }
    print("Понравилось $likes $word")
}